package enhancements;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Java 9 or later
public class TransferTo {

    private static final int BUFFER_SZ = 1024;

    public static void main(String[] args) throws IOException {

        // Java 8までの例
        byte[] buf = new byte[BUFFER_SZ];
        int nread;
        InputStream in = new FileInputStream("test.txt");
        OutputStream out = new FileOutputStream("out.txt");

        while ((nread = in.read(buf)) > 0) {
            out.write(buf, 0, nread);
        }

        // Java 9の例
        in.transferTo(out);

    }

}
