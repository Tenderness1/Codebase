package cn.itjiayan_demo02;

public class Test03 {

    public static void main(String[] args) {
        Sensor s = new Sensor();

        for (int i = 0; i < 100; i++) {
            new Thread(s).start();
        }
    }
}
