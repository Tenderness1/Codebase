package cn.itjiayan_demo01;

import java.io.File;


public class Test05 {
    public static void main(String[] args) {
        File f = new File("G://");
        File[] files = f.listFiles();
        for (File file : files) {
            System.out.println(file);
        }


    }




}
