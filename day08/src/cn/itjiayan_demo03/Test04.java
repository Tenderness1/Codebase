package cn.itjiayan_demo03;


//用递归反转字符串

public class Test04 {


    public static void main(String[] args) {
       String a="abcd";
        String s = reverse(a);
        System.out.println(s);


    }

    private static String reverse(String a) {
        if(a.length()<2||a==null){
            return a;
        }
        return reverse(a.substring(1))+a.charAt(0);
    }
}
