package cn.itjiayan_demo01;

public class Test {

    public static void main(String[] args) {
        makeFood(()->{
            System.out.println("宫保鸡丁做好了");
        });
    }


    public static void makeFood(Cook cook){

        cook.makeFood();
    }
}
