package cn.itjaiyan_demo01;

import java.io.FileOutputStream;
import java.io.IOException;


public class Test {

    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G://a.txt");

       fos.write(609);

        fos.close();
    }

}
