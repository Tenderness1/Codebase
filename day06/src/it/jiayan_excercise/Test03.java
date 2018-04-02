package it.jiayan_excercise;

public class Test03 {


    public static void main(String[] args) {

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName());
                }
            }
        }, "555");



        for (int i = 0; i < 50; i++) {
            for (int i1 = 0; i1 < 100; i1++) {

                System.out.println(Thread.currentThread().getName());
            }




        }


    }
}
