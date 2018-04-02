package it.jiayan_excercise;

import java.util.ArrayList;
import java.util.Collections;

public class Test {


    public static void main(String[] args) {

        Object o = new Object();
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


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < list.size(); i++) {
                    synchronized (o){


                        System.out.println(list.get(i).getName());

                        try {
                            o.wait(50);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }

            }
        });


        thread.start();
    }
}
