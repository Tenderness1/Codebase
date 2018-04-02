package it.jiayan_excercise;

import java.util.ArrayList;
import java.util.Collections;

public class Man implements Runnable {
    Object o = new Object();

  ArrayList<Person> list;
    public Man(ArrayList<Person> list) {
        this.list=list;
    }


    @Override
    public void run() {

            synchronized (o) {
                if (list.size() > 0) {
                Person s = list.remove(0);
                    System.out.println(s.getName());

                    try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}
