package it.jiayan_demo01;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03 {


    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();


        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("刘德华","柳岩");
        map.put("黄晓明","Baby");
        map.put("谢霆锋","张柏芝");


        Set<String> set = map.keySet();

        Iterator<String> it = set.iterator();

        while(it.hasNext()){
            String s = it.next();
            String s1 = map.get(s);
            System.out.println(s+":"+s1);
        }

        System.out.println("--------------------------------------");

        Set<Map.Entry<String, String>> set1 = map.entrySet();
        Iterator<Map.Entry<String, String>> it1 = set1.iterator();

        while(it1.hasNext()){

            Map.Entry<String, String> next = it1.next();
            System.out.println(next.getKey()+"--"+next.getValue());
        }


        System.out.println("*************************************");



    }



}
