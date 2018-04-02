package it.jiayan_demo04;

import java.util.HashMap;

public class Test02 {
    public static void main(String[] args) {
        String[] str = {"哈尔滨","杭州","南昌","广州","福州"};
        String[] str1 = {"黑龙江省","浙江省","江西省","广东省","福州省"};
        HashMap<Object, Object> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            String key=str1[i];
            String value=str[i];
            map.put(key,value);
        }

        System.out.println(map);


    }


}
