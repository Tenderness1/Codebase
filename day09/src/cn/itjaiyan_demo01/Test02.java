package cn.itjaiyan_demo01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("E://asd.jpg");
        FileOutputStream fos = new FileOutputStream("G://s.jpg");

        byte[] b = new byte[1024];

        int m;
        while((m=fis.read(b))!=-1){

                fos.write(b,0,m);

        }
        
        fis.close();
        fos.close();
    }
}
