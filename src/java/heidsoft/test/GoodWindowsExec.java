import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * ������
 *
 * @author heidsoft
 *         http://www.javaworld.com/article/2071275/core-java/when-runtime-exec---won-t.html?page=2
 */
class StreamGobbler extends Thread {
    InputStream is;
    String type;

    StreamGobbler(InputStream is, String type) {
        this.is = is;
        this.type = type;
    }

    public void run() {
        try {
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = null;
            while ((line = br.readLine()) != null)
                System.out.println(type + ">" + line);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}

public class GoodWindowsExec {

    public static void main(String[] args) {
        Runtime rt = Runtime.getRuntime();

        String cmd = "C:/Python27/python.exe D:/vnc/utils/websockify.py localhost:5900 --target-config=D:/vnc/vmtoken 8888 --web=D:/vnc";
        Process proc;
        try {
            proc = rt.exec(cmd);
            // any error message?
            StreamGobbler errorGobbler = new
                    StreamGobbler(proc.getErrorStream(), "ERROR");

            // any output?
            StreamGobbler outputGobbler = new
                    StreamGobbler(proc.getInputStream(), "OUTPUT");

            // kick them off
            errorGobbler.start();
            outputGobbler.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
