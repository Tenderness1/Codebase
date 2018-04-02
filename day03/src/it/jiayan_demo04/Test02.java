package it.jiayan_demo04;

import java.util.HashSet;
import java.util.Random;

public class Test02 {
    public static void main(String[] args) {

        HashSet<Object> set = new HashSet<>();
        Random ran  = new Random();
        while(set.size()<6){
            int i = ran.nextInt(33)+1;
            set.add(i);


        }
        System.out.println(set);

        int s = ran.nextInt(16)+1;



    }



}
