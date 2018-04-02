package it.jiayan_Demo01;

import java.util.HashSet;
import java.util.Iterator;

public class Demo03 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("zhangsan");
        hashSet.add("lisi");
        hashSet.add("wangwu");
        hashSet.add("zhangsan");
        Iterator<String> it = hashSet.iterator();
        while(it.hasNext()){

            System.out.println(it.next());

        }
    }

}
