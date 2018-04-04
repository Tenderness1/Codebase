package cn.itjiayan_demo03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws IOException{
        FileOutputStream fos = new FileOutputStream("G://stu.txt");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入学生信息，输入end结束：");
        while(true){
            String s = sc.nextLine();
            if(s.contains("end")){
                System.out.println("录入结束");
                break;
            }

            fos.write((s+"\r\n").getBytes());


        }

        fos.close();
    }
}
