import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TestVNC {
    public static void main(String[] args) {
        String tokenDir = "/opt/dmonitor/managedserver/tomcat/webapps/dmonitor-webapp/vnc/vmtoken/";
        String tokenName = tokenDir + "one-" + "242" + ".txt";
        File tokenFile = new File(tokenName);
        try {
            FileOutputStream out = new FileOutputStream(tokenFile);
            //123456: 192.168.70.71:6142
            String token = String.valueOf(new Date().getTime());
            String host = "192.168.70.71";//todo  config
            String hostProxyPort = "6142";//todo config
            String tokenContext = token + ": " + host + ":" + hostProxyPort;//
            out.write(tokenContext.getBytes());
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        Process proc = null;
        String line = null;
        try {
            proc = Runtime.getRuntime().exec("python /root/vnc/utils/websockify --target-config=/opt/dmonitor/managedserver/tomcat/webapps/dmonitor-webapp/vnc/vmtoken 29876 --web=/opt/dmonitor/managedserver/tomcat/webapps/dmonitor-webapp/vnc");
            synchronized (proc) {
                BufferedReader br = null;
                br = new BufferedReader(new InputStreamReader(proc.getInputStream()));
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }

                br.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (proc != null) {
                try {
                    proc.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                proc.destroy();

            }
        }
    }
}
