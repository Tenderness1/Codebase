package it.jiayan_demo02;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.Collections;

public class Test06 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,11,33,55,77);
        Object[] array = list.toArray();
        int[] ints = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            ints[i]=(int)array[i];
        }
        for (int i : ints) {
            System.out.println(i);
        }


        System.out.println("---------------------");

        int[] ints1 = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ints1[i]=list.get(i);
        }
        for (int i : ints) {
            System.out.println(i);
        }
    }
}
