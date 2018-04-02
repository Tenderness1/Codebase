package it.jiayan_excercise;

public class Demo02 {
    public static void main(String[] args) {
        while (true) {

            System.out.println("主线程执行");


            new Thread(new Runnable() {
                @Override
                public void run() {

                    System.out.println("子线程执行");
                    }
                }
            ).start();
        }
    }
}
