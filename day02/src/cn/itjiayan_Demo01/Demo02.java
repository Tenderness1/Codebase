package cn.itjiayan_Demo01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Demo02 {


    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");
        list.add("d");


        System.out.println(listTest(list,"a"));
        System.out.println(listTest(list,"b"));
        System.out.println(listTest(list,"c"));
        System.out.println(listTest(list,"d"));
        int[] ints ={2,5,5,5,8,4,9,6,4,7};

        Collection c = transform1(ints);
        System.out.println(c);


    }
    
    
    public static <String>int listTest(ArrayList<String> s, String b){
        int i=0;
        for (int i1 = 0; i1 < s.size(); i1++) {
                if(s.get(i1).equals(b)){

                i++;
            }
        }


        
        
        return  i;
    }



    public static Collection transform1(int[] a  ){
        ArrayList<Object> list = new ArrayList<>();
        for (int i : a) {
            list.add(i);
        }
              return list;
    }
}




