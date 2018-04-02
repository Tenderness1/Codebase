package it.jiayan_demo02;

import java.util.ArrayList;
import java.util.Collections;

public class Test03 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Collections.addAll(list,33,11,77,55);
        Collections.sort(list);

        System.out.println(list);


        System.out.println("------------");

        Collections.shuffle(list);
        System.out.println(list);


        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%");

        Collections.reverse(list);
        System.out.println(list);


        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");


        int i = Collections.binarySearch(list, 33);
        System.out.println(i);
    }
}
