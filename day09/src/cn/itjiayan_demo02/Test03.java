package cn.itjiayan_demo02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test03 {
    public static void main(String[] args)throws IOException {
        FileOutputStream fos = new FileOutputStream("G://b.txt",true);
        for (int i = 0; i < 5; i++) {
            fos.write("Hello world\r\n".getBytes());
        }
        fos.close();
    }
}
