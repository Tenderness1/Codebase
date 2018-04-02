package it.jiayan_demo01;

import java.net.SocketTimeoutException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo02 {

    public static void main(String[] args) {


        HashMap<String, String> map = new HashMap<>();
        map.put("黄晓明","Baby");
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("大黑牛","范冰冰");

        Set<String> keySet = map.keySet();
        for (String s : keySet) {
            System.out.println(s);
        }


        System.out.println("--------------------------------");

        Iterator<String> it = keySet.iterator();

        while(it.hasNext()){

            System.out.println(it.next());


        }


        System.out.println("----------------------------------------------");

        Collection<String> values = map.values();
        for (String s : values) {
            System.out.println(s);
        }


        System.out.println("================================================================");
        Iterator<String> itt = values.iterator();
        while(itt.hasNext()){

            System.out.println(itt.next());
        }

    }
}
