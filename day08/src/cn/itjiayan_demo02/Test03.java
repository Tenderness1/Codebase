package cn.itjiayan_demo02;
/*描述:从键盘接收一个文件夹路径,获得该文件夹大小并输出到控制台。
        答案
        操作步骤:
        1.	创建键盘录入对象Scanner
        2.	定义字符串接收用户输入的文件夹路径
        3.	根据文件夹路径创建文件对象
        4.	定义一个方法calculate用来计算指定文件夹的大小，接收文件参数，
        返回long类型数值表示文件夹的大小。
        5.	调用calculate方法传入文件夹对象，在该方法内部获得文件夹中所有文件，
        得到一个文件数组，定义一个变量size累加每一个文件的大小，遍历文件数组，判断是否是文件
        ，如果是文件则获得文件大小并累加到变量size中，如果是文件夹，继续递归调用当前方法。*/


import java.io.File;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {

        System.out.println("请输入路径：");
        File file = new File(new Scanner(System.in).nextLine());
        caculate(file);

    }

    private static long caculate(File file) {
        long size = 0;
        File[] f1 = file.listFiles();
        for (File file1 : f1) {
            if (file1.isFile()) {
                size += file1.length();
            } else {
                size += caculate(file1);
            }
        }
        return size;

    }

}
