package cn.itjiayan_demo01;

import java.io.File;
import java.util.Scanner;

public class Test06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        File file = new File(s);
        File[] f = file.listFiles();
        for (File f1 : f) {
            if (f1.isFile()) {

                System.out.println(f1.length());
            } else {
                int length = 0;
                File[] files = f1.listFiles();
                for (File file1 : files) {
                    length+=file1.length();
                }
                System.out.println("大小为："+length);

            }
        }
    }
}
