package it.jiayan_demo02;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Man man1 = new Man("热巴",18);
        Man man2 = new Man("杨幂",45);
        Man man3 = new Man("曹俊",28);
        Man man4 = new Man("紫霞",28);
        Man man5 = new Man("紫霞",28);
        HashSet<Man> hashSet = new HashSet<>();
        hashSet.add(man1);
        hashSet.add(man2);
        hashSet.add(man3);
        hashSet.add(man4);
        hashSet.add(man5);
        hashSet.add(man5);
        System.out.println(hashSet);



    }
}
