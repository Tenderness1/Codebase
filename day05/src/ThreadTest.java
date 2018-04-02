public class ThreadTest {

    public static void main(String[] args) {

        MyThread myThread = new MyThread("哈哈");
        MyThread myThread1 = new MyThread("嘻嘻");
        myThread.start();
        myThread1.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main线程"+i);
        }
    }
}
