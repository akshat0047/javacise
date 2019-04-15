import java.io.*;
import java.util.*;

public class filecopy {

    public static void main(String args[]) throws IOException {

        FileInputStream fi = new FileInputStream(args[0]);
        FileOutputStream fo = new FileOutputStream(args[1]);
        int b;
        while ((b = fi.read()) != -1) {
            fo.write(b);
        }

        fo.close();
        fi.close();
    }
}