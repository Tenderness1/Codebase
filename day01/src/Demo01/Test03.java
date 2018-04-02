package Demo01;

import java.util.Date;

public class Test03 {
    public static void main(String[] args) {
          String s="";
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            s+="哈哈";
        }
        long end =System.currentTimeMillis();

        long middle= System.currentTimeMillis();


        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("哈哈");
        }

        long last=System.currentTimeMillis();


        System.out.println(Math.abs(start-end));
        System.out.println(Math.abs(end-last));

    }
}
