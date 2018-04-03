package cn.itjiayan_demo03;

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
