package cn.itjiayan_demo03;

import java.io.FileInputStream;
import java.io.IOException;

/*
描述:
        在D盘下有一个文本文件test.txt(里面的内容由数字和字母组成)
        定义一个方法统计test.txt文件中指定字符出现的次数。
        比如a字符在文件中出现了10次则调用方法传入a后，方法内部输出：a出现10次
        答案
        操作步骤:
        1.	创建字节输入流对象，循环从文件中读取一个字节
        2.	定义一个整数变量用来统计字符出现的次数。
        3.	将读取的字节转换字符跟传入的字符进行比较，相同则计数加一。
        4.	输出结果。
*/


public class Test {
    public static void main(String[] args)throws IOException{


        System.out.println(countNum('q'));
    }

    private static int countNum(char a)throws IOException {
        FileInputStream fis = new FileInputStream("G://text.txt");
        int count =0;
        int s;
        while((s=fis.read())!=-1){

            if((char)s==a){
                count++;
            }
        }


        fis.close();

        return count;
    }
}
