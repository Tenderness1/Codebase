package cn.itjiayan_demo04;

public class Test {

    public static void main(String[] args) {
        invokeDirect(()-> System.out.println("导演要拍电影了"));



    }

        private static void invokeDirect(Director director) {

        director.makeMovie();
    }


}
