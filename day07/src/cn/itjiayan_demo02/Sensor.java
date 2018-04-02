package cn.itjiayan_demo02;

import java.util.Random;

public class Sensor implements Runnable {
   Object obj= new Object();

    @Override
    public void run() {

        synchronized (obj){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Random r = new Random();
            int temperature=r.nextInt(50)+1;
            int humidity=r.nextInt(100)+1;
            int windScale=r.nextInt(40)+1;


            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"-当前温度："+temperature+"度");
            System.out.println(Thread.currentThread().getName()+"-当前湿度："+humidity+"%");
            System.out.println(Thread.currentThread().getName()+"-当前风速："+windScale+"米/秒");
            System.out.println("--------------------------");


        }


    }
}
