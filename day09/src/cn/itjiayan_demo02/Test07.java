package cn.itjiayan_demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test07 {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);
        byte[] by = new byte[1024];
        FileOutputStream fos = new FileOutputStream("G://info.txt",true);
        while(true){

            System.out.println("请输入内容，按886结束");
            String s = sc.nextLine();
            if(s.contains("886")){
                fos.close();
                break;
            }
           fos.write((s+"\r\n").getBytes());



        }
    }
}
