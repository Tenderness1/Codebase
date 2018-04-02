package cn.itjiayan_demo02;

/*描述:
        键盘录入一个文件夹路径，删除该路径下的文件夹。
        要求：录入的文件夹里面要有多个文件，不能包含有子文件夹。
        提示：如果文件夹里面有文件，则需要先将文件删除才能删除文件夹。
        答案
        操作步骤:
        1.	创建键盘录入对象Scanner
        2.	定义字符串接收用户输入的文件夹路径
        3.	根据文件夹路径创建文件对象
        4.	调用文件对象的listFiles方法获得文件数组
        5.	遍历文件数组，删除每一个文件
        6.	最后调用删除方法删除文件夹。*/


import java.io.File;
import java.util.Scanner;

public class Test02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入路径：");
        File file = new File(sc.nextLine());
        File[] f1 = file.listFiles();
        for (File f2 : f1) {
           f2.delete();
            }

        System.out.println(file.delete()?"删除成功":"删除失败");
        }
    }

