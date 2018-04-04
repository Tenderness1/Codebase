package cn.itjiayan_demo02;

import java.io.FileInputStream;
import java.io.IOException;

public class Test05 {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new FileInputStream("G://b.txt");
        int a;
        byte[] bb = new byte[1024];
        while((a=fis.read(bb))!=-1){
            System.out.println(new String(bb,0,a));

        }
        fis.close();
    }
}
