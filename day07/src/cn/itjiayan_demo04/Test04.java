package cn.itjiayan_demo04;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test04 {


    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(3);
        Sell s = new Sell();

        for (int i = 0; i < 100; i++) {
            pool.submit(s);
        }



    }
}
