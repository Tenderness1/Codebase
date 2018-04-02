package cn.itjiayan_demo01;


import java.util.Scanner;

public class Test04 {
    public static void main(String[] args) {

        System.out.println("请输入您需要的数值");

        int i = sum(new Scanner(System.in).nextInt());
        System.out.println(i);

    }

    private static int  sum(int n) {

        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
}
