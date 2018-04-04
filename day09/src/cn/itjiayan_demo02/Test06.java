package cn.itjiayan_demo02;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test06 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("G://s.jpg");
        FileOutputStream fos = new FileOutputStream("h://w.jpg");

        int a;
        while ((a = fis.read()) != -1) {

            fos.write(a);

        }

        fis.close();
        fos.close();
    }
}
