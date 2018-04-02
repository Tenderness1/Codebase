package cn.itjiayan_demo02;

public class Test04 {

    public static void main(String[] args) {
        PrintRunnable runnable = new PrintRunnable();
        Thread thread1 = new Thread(runnable,"111");
        Thread thread2 = new Thread(runnable,"222");

        thread1.setPriority(10);
        thread2.setPriority(6);
        thread1.start();
        thread2.start();

    }
}
