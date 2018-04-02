package cn.itjiayan_demo03;

public class Test {

    public int start=1;
    public int end=99;

    public static void main(String[] args) {
        new Test().method();
    }

    private void method() {
        Runnable a = new Runnable() {
            @Override
            public void run() {
                for (int i = start; i <= end; i++) {
                    System.out.println(i);
                }
            }
        };
        Thread t = new Thread(a);
        t.start();
    }
}
