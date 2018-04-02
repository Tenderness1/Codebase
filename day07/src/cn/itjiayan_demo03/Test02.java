package cn.itjiayan_demo03;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test02 {

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        MyRunnable mm = new MyRunnable();
        pool.submit(mm);
    }
}
