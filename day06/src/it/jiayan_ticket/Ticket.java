package it.jiayan_ticket;

public class Ticket implements Runnable {

   private int ticket=100;
    @Override
    public void run() {
synchronized (this) {
    while (true) {
        if (ticket > 0) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + ":" + ticket--);
        }
    }
}
    }
}
