package cn.itjiayan_demo01;

public class Fibonacci {

    public static void main(String[] args) {

//        System.out.println(sum(3));

        System.out.println(sum2(10));

        System.out.println( sum3(1));
    }

    private static int sum3(int day) {

        if(day==10){
            return 1;
        }else {

            return 2*sum3(day+1)+2;
        }

    }

    private static int sum2(int i) {
        if(i==1){

            return 1;
        }


        return 2*(sum2(i-1)+1);

    }

    private static int sum(int a) {

        if (a == 1 || a == 2) {
            return 1;
        }
        return sum(a - 1) + sum(a - 2);
    }


}

