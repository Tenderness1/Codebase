package it.jiayan_demo02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class Test05 {
    public static void main(String[] args) {
        String[] strs = {"12345","67891","2347809933","98765432102","67891","12347809933"};
        LinkedList<String> list = new LinkedList<>();
        for (String str : strs) {
            list.add(str);
        }
        System.out.println(list);
        HashSet<String> hashSet = new HashSet<>();
        hashSet.addAll(list);
        list.clear();
        list.addAll(hashSet);
        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
