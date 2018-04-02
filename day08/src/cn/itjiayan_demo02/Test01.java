package cn.itjiayan_demo02;
/*1.	创建一个类实现文件过滤器FileFilter接口并重新accept方法，在该方法根据传入的文件判断是否文件Java文件，如果是则返回true，否则返回false。
        2.	根据文件夹路径字符串创建文件对象和创建文件过滤器接口实现类对象
        3.	调用文件对象的listFiles(FileFilter f) 方法，传递文件过滤器实现类对象。
        4.	遍历文件数组，输入每一个文件对象*/

import java.io.File;
import java.io.FileFilter;

public class Test01 {

    public static void main(String[] args) {
        File f1 = new File("G://fan.java");
        File[] files = f1.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
               if(pathname.getName().endsWith(".java")){
                   return true;
               }
               return false;
            }
        });

        for (File file : files) {
            System.out.println(file.getAbsolutePath());
        }


    }
}
