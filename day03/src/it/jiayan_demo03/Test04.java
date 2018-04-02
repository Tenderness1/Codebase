package it.jiayan_demo03;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String s = sc.nextLine();
        char[] chars = s.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for (char aChar : chars) {
             set.add(aChar);
        }

        System.out.println(set);

    }
}
