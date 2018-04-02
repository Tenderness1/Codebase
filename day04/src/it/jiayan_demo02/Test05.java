package it.jiayan_demo02;



import java.util.ArrayList;

public class Test05 {
    public static void main(String[] args) {
        ArrayList<String> sa = add("ssss", "ssss", "aasrraf");
        System.out.println(sa);
    }

    public static ArrayList<String>  add(String... a){
        ArrayList<String> list = new ArrayList<>();
        for (String s : a) {
            list.add(s);
        }
        return list;

    }
}
