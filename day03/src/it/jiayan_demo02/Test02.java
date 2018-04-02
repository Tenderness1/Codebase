package it.jiayan_demo02;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test02 {

    public static void main(String[] args) {
        LinkedHashSet<String> s = new LinkedHashSet<>();
        s.add("王昭君");
        s.add("王昭君");
        s.add("西施");
        s.add("杨玉环");
        s.add("貂蝉");

        Iterator<String> it = s.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println("------------------------");
        for (String s1 : s) {
            System.out.println(s1);
        }
    }
}
