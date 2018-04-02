package it.jiayan_demo04;

import java.util.ArrayList;
import java.util.HashMap;

public class Test03 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");
        HashMap<Character, Integer> map = new HashMap<>();
        for (String s : list) {
            char[] chars = s.toCharArray();
            for (char aChar : chars) {
                Integer number=map.get(aChar);
                if(number==null){

                    map.put(aChar,1);
                }else {

                map.put(aChar,number+1);

                }
            }
        }


        System.out.println(map);
    }
}
