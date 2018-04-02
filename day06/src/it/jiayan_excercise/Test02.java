package it.jiayan_excercise;

import java.util.ArrayList;
import java.util.Collections;

public class Test02 {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<>();
            Person p1 = new Person("1");
            Person p2 = new Person("2");
            Person p3 = new Person("3");
            Person p4 = new Person("4");
            Person p5 = new Person("5");
            Person p6 = new Person("6");
            Person p7 = new Person("7");
            Person p8 = new Person("8");
            Person p9 = new Person("9");
            Person p10 = new Person("10");
            Collections.addAll(list,p1,p2,p3,p4,p5,p6,p7,p8,p9,p10);


        Man m = new Man(list);
        Thread t1 = new Thread(m);
        Thread t2 = new Thread(m);
        Thread t3 = new Thread(m);
        Thread t4 = new Thread(m);
        Thread t5 = new Thread(m);
        Thread t6 = new Thread(m);
        Thread t7 = new Thread(m);
        Thread t8 = new Thread(m);
        Thread t9 = new Thread(m);
        Thread t10 = new Thread(m);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        t9.start();
        t10.start();



    }
}
