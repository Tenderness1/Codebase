package it.jiayan_demo01;

import java.util.Collections;
import java.util.HashMap;

public class Demo01 {

    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        map.put("黄晓明","Baby");
        map.put("邓超","孙俪");
        map.put("李晨","范冰冰");
        map.put("大黑牛","范冰冰");

        String s = map.put("李晨", "白百合");
        String s1 = map.get("大黑牛");
        String s2 = map.remove("大黑牛");
        String s3 = map.remove("sssss");
        System.out.println(s+s1+s2+s3);


    }
}
