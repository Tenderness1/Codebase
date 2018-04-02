package it.jiayan_demo02;

public class Test02 {

    public static void main(String[] args) {
        int i = add(1, 2, 4, 33, 44);
        System.out.println(i);


    }

    public static int add(int... a){
        int sum=0;
        for (int i : a) {
          sum+=i;
        }

        return sum;
     }
}
