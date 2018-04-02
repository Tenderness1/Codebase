package cn.itjiayan_demo02;

import java.util.Random;

public class Test02 {
    public static void main(String[] args) {


        Random random = new Random();
        int n = random.nextInt(10) + 1;

        AddThreadRunnable atr = new AddThreadRunnable(n);
        for (int i = 0; i <= n; i++) {
            new Thread(atr).start();

        }



    }
}
