package it.jiayan_demo02;

import java.util.ArrayList;
import java.util.HashSet;

public class Test03 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("f");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("d");
        HashSet<String> set = new HashSet<>();
       set.addAll(list);
        System.out.println(set);
    }
}
