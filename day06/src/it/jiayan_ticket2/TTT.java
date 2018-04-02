package it.jiayan_ticket2;

public class TTT {
    public static void main(String[] args) {
        getTest(6+"");
        System.out.println("+0");
    }

    public static void  getTest(String s){
        getTest1(9);

        System.out.println("heh +1"+s);
    }
    public static void  getTest1(int p){
        getTest2();
//        int i=1/0;
        System.out.println("heh +2"+p);
    }
    public static void  getTest2(){
        System.out.println("heh +3");
    }
}
