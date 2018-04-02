package it.jiayan_demo04;

import java.util.HashMap;
import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一行字符串：");
        String line = sc.nextLine();
        HashMap<String, Integer> map = new HashMap<>();
        String[] strings = line.split(" ");

        for (String string : strings) {
            Integer number=map.get(string);
            if(number==null){

                map.put(string,1);
            }else{
                map.put(string,number+1);
            }
        }
        System.out.println(map);
    }
}
