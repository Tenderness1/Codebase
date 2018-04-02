package it.jiayan_demo03;

import java.util.ArrayList;
import java.util.HashSet;

public class Test02 {
    public static void main(String[] args) {
        String arr[]={"abc","bad","abc","aab","bad","cef","jhi"};
        HashSet<String> set = new HashSet<>();
        for (String s : arr) {
            set.add(s);
        }
        System.out.println(set);
        System.out.println("---------------");
        ArrayList<String> list = new ArrayList<>();
        list.addAll(set);
        System.out.println(list);

    }

}
