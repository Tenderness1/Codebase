package cn.itjiayan_demo02;

public class Demo02 {

    public static void main(String[] args) {
        function("哈哈哈");
        function(4156456);

        function(45.23);

    }

    public static <T>void function(T t){

        System.out.println(t);
    }
}
