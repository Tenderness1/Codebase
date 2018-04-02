package it.jiayan_demo02;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test04 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        while (map.size()<5) {
           System.out.println("请输入姓名和年龄，格式为：姓名，年龄");
           String s = new Scanner(System.in).nextLine();

           String[] ss = s.split(",");

           map.put(ss[0],Integer.valueOf(ss[1]));

       }


        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s+":"+map.get(s));
        }

        System.out.println(map);
    }
}
