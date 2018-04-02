package it.jiayan_demo03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test03 {
    public static void main(String[] args) {
        Random ran = new Random();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            set.add(ran.nextInt(20)+1);
        }

        Iterator<Integer> it = set.iterator();
        while (it.hasNext()){

            System.out.println(it.next());
        }
    }
}
