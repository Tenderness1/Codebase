package cn.itjiayan_demo02;

import java.sql.SQLOutput;

public class Imple01<E> implements Inter<E> {
    @Override
    public void show(E e) {
        System.out.println(e);
    }
}
