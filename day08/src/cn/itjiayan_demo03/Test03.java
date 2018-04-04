package cn.itjiayan_demo03;

/*
从键盘接收一个文件夹路径,把文件夹中的所有文件以及文件夹的名字按层级打印
例如:
aaa是文件夹,里面有bbb.txt,ccc.txt,ddd.txt这些文件,有eee这样的文件夹,eee中有fff.txt和ggg.txt,打印出层级来
	aaa
		bbb.txt
		ccc.txt
		ddd.txt	
		eee
			fff.txt
			ggg.txt

*/

import java.io.File;
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        System.out.println("请输入一个文件夹路径：");
        File file = new File(new Scanner(System.in).nextLine());
   
   printDir(file,0);
    }

    private static void printDir(File f,int level) {

        for (int i = 0; i < level; i++) {
            System.out.println("\t");
        }
        System.out.println(f.getName());
        if(f.isDirectory()){

            File[] files = f.listFiles();
            for (File file : files) {
                printDir(file,level+1);
            }
        }
    }

}
