package cn.itjiayan_demo02;

public class PrintRunnable implements Runnable {
    Object obj = new Object();

    @Override
    public void run() {
synchronized (obj){

    int i = Thread.currentThread().getPriority();

    if(i==10){

        for (int i1 = 0; i1 < 5; i1++) {
            System.out.println(Thread.currentThread().getName()+"正在运行");
        }



        }else if(i==6){


        for(int i2=1;i2<=10;i2++){
            System.out.println(Thread.currentThread().getName()+"正在运行");
        }

    }


}
    }
}
