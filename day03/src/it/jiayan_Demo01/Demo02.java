package it.jiayan_Demo01;

import java.util.LinkedList;

public class Demo02 {

    public static void main(String[] args) {
        LinkedList<Object> list = new LinkedList<>();
        list.add("s");
        list.add("ssd");
        list.add("saas");
        list.add("ssdsd");
        System.out.println(list);
        list.set(2,15);
        System.out.println( list.get(2));
        list.remove(3);

        list.clear();
        System.out.println(list.size());


        LinkedList<String> linked = new LinkedList<>();

        linked.add("刘德华");
        linked.add("张学友");
        linked.addFirst("黎明");
        linked.addLast("郭富城");
        System.out.println(linked);

        System.out.println(linked.getFirst());
        System.out.println(linked.getLast());

        String first=linked.removeFirst();
        System.out.println(first);

        String last=linked.removeLast();
        System.out.println(last);
        System.out.println(linked);
        linked.clear();



    }
}
