package chapter6.t06_Serializable;

import java.io.*;

public class TestHex {
    public static void main(String[] args) {
        try {
            File file = new File("myObjectFile.txt");
            InputStream inputStream = new FileInputStream(file);
            byte[] b = new byte[1];
            int len = -1;
            while ((len = inputStream.read(b)) != -1) {
                inputStream.read(b, 0, len);
                for (byte bb : b) {
                    System.out.println(Integer.toHexString(bb));
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
