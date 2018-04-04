package cn.itjiayan_demo02;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test02 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("G://b.txt");
        String s="i love java";
        fos.write(s.getBytes());


        fos.close();
    }
}
