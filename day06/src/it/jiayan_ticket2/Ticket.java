package it.jiayan_ticket2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket implements Runnable{

   Lock lock= new ReentrantLock();

   private int ticket=100;




    @Override
    public void run() {

       /* while (true){
            lock.lock();
            if(ticket>0){

                System.out.println(Thread.currentThread().getName()+"正在卖："+ticket--);
            }



            lock.unlock();
        }
*/

       while (true){
           try {
               Thread.sleep(50);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }

           synchronized (this){

               if(ticket>0){

                   System.out.println(Thread.currentThread().getName()+"正在卖："+ticket--);
               }



           }


       }

    }
}
