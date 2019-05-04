package enhancements.trywithresources;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.file.Paths;

// Java 9 or later
public class TryWithResources {

    public static void main(String[] args) throws Exception {

        // Java7, 8
        Socket clientSocket = new Socket();
        try (InputStream in = clientSocket.getInputStream();
                OutputStream out = clientSocket.getOutputStream();
                FileOutputStream fout = new FileOutputStream(Paths.get("test.dat").toFile())) {
            /* 処理 */
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Java 9 or later
        Socket client = null;
        InputStream in = client.getInputStream();
        OutputStream out = client.getOutputStream();
        FileOutputStream fout = new FileOutputStream("test.dat");
        try (in; out; fout) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
