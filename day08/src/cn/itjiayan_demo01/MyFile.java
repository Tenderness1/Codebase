package cn.itjiayan_demo01;

import java.io.File;
import java.io.FileFilter;


public class MyFile implements FileFilter{
    @Override
    public boolean accept(File pathname) {
       if(pathname.isFile()){

           if(pathname.getName().endsWith(".java")){
               return true;
           }
       }

       return true;
    }
}
