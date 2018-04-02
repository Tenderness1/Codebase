package it.jiayan_demo04;


import java.util.HashMap;

public class Test05 {

    public static void main(String[] args) {
        String str="上海传智播客，上海黑马，武汉传智播客，深圳黑马，北京传智播客，广州黑马，北京黑马";
        HashMap<String, Integer> map = new HashMap<>();

        map.put("传智播客",0);
        map.put("黑马",0);

        String[] strings = str.split("，");

        for (String string : strings) {
            if(string.contains("传智播客")){
                Integer number=map.get("传智播客");

                map.put("传智播客",number+1);
            }else if(string.contains("黑马")){
                Integer number=map.get("黑马");

                map.put("黑马",number+1);
            }
        }


        System.out.println(map);
    }



}
