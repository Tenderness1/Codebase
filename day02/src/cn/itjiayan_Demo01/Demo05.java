package cn.itjiayan_Demo01;


import java.util.ArrayList;
import java.util.Collection;

public class Demo05 {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();

        c.add("sss");
        c.add("ssa");
        c.add("saws");
        c.add("ser");
        boolean b = c.remove("sss");
        System.out.println(c.size());
        System.out.println(c);
        c.clear();
        System.out.println(c);


    }
}
