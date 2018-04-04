package cn.itjiayan_demo02;
/*描述:利用字节输出流一次写一个字节的方式向D盘的a.txt文件输出字符 ‘a’。
        答案
        操作步骤:
        1.	创建字节输出流FileOutputStream对象并指定文件路径。
        2.	调用字节输出流的write(int byte)方法写出数据*/


import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{


       FileOutputStream fos = new FileOutputStream("d://a.txt");
       Character a='a';
        fos.write(a.toString().getBytes());



       fos.close();




    }
}
