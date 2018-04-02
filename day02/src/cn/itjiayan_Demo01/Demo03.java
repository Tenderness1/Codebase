package cn.itjiayan_Demo01;

import java.util.ArrayList;

public class Demo03 {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(3);
        list.add(2);

        Object[] ob = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {

            ob[i] = list.get(i);
        }

        for (int i = 0; i < ob.length; i++) {
            System.out.print(ob[i]);
        }


        ArrayList<String> list1 = new ArrayList<>();
        list1.add("哈哈哈");
        list1.add("嘻嘻");
        list1.add("额");
        list1.add("哈哈哈");
        boolean b = listTest(list1, "哈哈哈");
        System.out.println(b);

    }


    public  static boolean listTest(ArrayList<String> al,String s){
        if(al.contains(s)){

            return true;
        }else {
            return false;
        }

    }


}
