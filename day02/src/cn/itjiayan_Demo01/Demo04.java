package cn.itjiayan_Demo01;

import java.util.ArrayList;
import java.util.Random;

public class Demo04 {
    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
          arr[i]  =ran.nextInt(100)+1;
        }

        ArrayList<Object> list = new ArrayList<>();
        for (int i : arr) {
            if(i>10){
                list.add(i);
            }
        }

        System.out.println(list);

        int[] ints ={5,6,57,4,5,4,5};
        String[] str = {"ddd","dddd","sssss5","s5888sss","SS"};
        transform(str,2,3);
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }



    public static <T>void transform(T[] arr,int a,int b){

          T temp =arr[a];
          arr[a]=arr[b];
          arr[b]=temp;

    }
}
