package cn.itjiayan_demo03;

/*
键盘录入一个文件夹路径,统计该文件夹(包含子文件夹)中每种类型的文件及个数
        注意:用文件类型(后缀名,不包含.(点),如："java","txt")作为key,
        用个数作为value,放入到map集合中,并用两种方式遍历map集合
        例如：
        doc 的类型的文件有  3 个
        java 的类型的文件有  5 个
        txt 的类型的文件有  7 个
*/


import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        File file = inputFile();

        HashMap<File,Integer> map = new HashMap<>();
    }

    private static File inputFile() {
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入一个文件路径：");
        File f = new File(sc.nextLine());
      if(!f.exists()) {
          throw new RuntimeException("您输入的路径不存在");

      }
      if(!f.isDirectory()){
          throw new RuntimeException("您输入的不是路径");
      }


        return  f;
    }
}
