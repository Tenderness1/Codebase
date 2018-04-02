package it.jiayan_ticket;

public class Demo {

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Thread t1 = new Thread(ticket,"1");
        Thread t2 = new Thread(ticket,"2");
        Thread t3 = new Thread(ticket,"3");



        t1.start();
        t2.start();
        t3.start();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
