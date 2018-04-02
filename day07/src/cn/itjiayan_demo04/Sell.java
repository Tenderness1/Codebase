package cn.itjiayan_demo04;

public class Sell implements Runnable {
  private int piao=100;

  Object o=new Object();

    @Override
    public void run() {
        synchronized (o){

            System.out.println(Thread.currentThread().getName()+"----"+"票："+piao);
            piao--;
            if(piao==0){
                System.out.println("没票了，结束出票");
            }

        }
    }
}
