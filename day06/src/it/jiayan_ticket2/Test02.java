package it.jiayan_ticket2;

public class Test02 {

    public static Object obj=new Object();

    public static void main(String[] args) {
        new Thread(new Runnable() {



                @Override
                public void run () {

                    while (true) {

                       synchronized (obj){

                           try {
                               obj.wait();

                               System.out.println(Thread.currentThread().getName()+"进入等待");
                           } catch (InterruptedException e) {
                               e.printStackTrace();
                           }
                       }



                    }


                }
        }).start();


        new Thread(new Runnable() {





                @Override
                public void run () {

                    while(true) {
                        try {
                            Thread.sleep(5000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                        synchronized (obj) {

                            obj.notify();

                            System.out.println(Thread.currentThread().getName()+"激活");
                        }
                    }
            }


        }).start();


    }
}
