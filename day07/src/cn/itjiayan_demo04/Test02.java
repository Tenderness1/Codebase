package cn.itjiayan_demo04;

import cn.itjiayan_demo01.Calculate;

public class Test02 {

    public static void main(String[] args) {
        invokeCalc(130,120,(a,b)->a+b);
    }

    private static void invokeCalc(int a, int b, Calculator calculate) {
        int result=calculate.calc(a,b);
        System.out.println("结果是："+result);

    }


}
