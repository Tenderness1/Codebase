package it.jiayan_demo03;

import java.util.HashSet;
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();
        int flag=0;
        while(flag==0){
            int i = sc.nextInt();
            if(i!=-1) {
                set.add(i);
            }else{
                flag=1;
            }


        }


        int sum=0;
        for (Integer in : set) {
            sum+=in;
        }

        System.out.println(sum);

    }
}
