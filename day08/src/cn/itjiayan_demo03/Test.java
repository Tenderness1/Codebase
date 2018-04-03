package cn.itjiayan_demo03;

import java.io.File;
import java.io.FileFilter;

public class Test {
    public static void main(String[] args) {
        File file = new File("G://SDK");

        getfile(file);
}

    private static void getfile(File file) {

        File[] f = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if(pathname.isDirectory()){
                    return true;
                }else{
                    return pathname.length()/1024<20;
                }
            }
        });

        for (File f1 : f) {
            if(f1.isDirectory()){
                getfile(f1);
            }else{
                System.out.println(f1);
            }

        }


    }
    }
