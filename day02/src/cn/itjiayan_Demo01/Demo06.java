package cn.itjiayan_Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo06 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();

        c.add("xixxi");
        c.add("hahah");
        c.add("lala");
        c.add("liuliuliu");
        Iterator<String> it = c.iterator();
        for (String s : c) {
            if(it.hasNext()){
                System.out.println(it.next());

            }

        }

    }
}
