package it.jiayan_excercise;

import java.sql.SQLOutput;

public class Demo01 {

    public static void main(String[] args) {
        new Thread(new Runnable() {


            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName());
            }
        },"NB").start();


        System.out.println(Thread.currentThread().getName());


        Thread1 thread1 = new Thread1("嘻嘻");

       thread1.start();
    }



}
