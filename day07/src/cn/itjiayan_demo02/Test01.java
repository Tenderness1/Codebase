package cn.itjiayan_demo02;

import java.util.ServiceConfigurationError;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test01 {

    public static void main(String[] args) {
        Runnable runnable =(()-> {
            System.out.println("嘻嘻哈哈");
            }
        );





        ExecutorService service = Executors.newFixedThreadPool(3);

       service.submit(runnable);


    }
}
