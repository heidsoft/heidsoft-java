import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: heidsoft-java
 * @description: test process
 * @author: heidsoft
 * @create: 2018-12-26 17:16
 **/
public class TestProcess {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("start ...");
        Process pr = Runtime.getRuntime().exec("python /opt/SougouCheckName.py Merculet" );

        BufferedReader in = new BufferedReader(new
                InputStreamReader(pr.getInputStream()));
        String line = in.readLine();

        System.out.println(line);

        in.close();
        pr.waitFor();
        System.out.println("end ...");
    }
}
