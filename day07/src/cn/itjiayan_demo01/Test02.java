package cn.itjiayan_demo01;

public class Test02 {
    public static void main(String[] args) {
        calculate(120,150,(int a,int b)->{return  a+b;});
    }

    private static void calculate(int a,int b,Calculate c) {
        int sum = c.sum(a, b);
        System.out.println(sum);
    }
}
