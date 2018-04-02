package it.jiayan_demo04;

import java.util.HashMap;
import java.util.Set;

public class Test {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1,"张三丰");
        map.put(2,"周芷若");
        map.put(3,"汪峰");
        map.put(4,"灭绝师太");

        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            System.out.println(integer+"；"+map.get(integer));
        }

        map.put(5,"李晓红");
        map.remove(1);
        map.put(2,"周林");

        System.out.println(map);


    }

}
