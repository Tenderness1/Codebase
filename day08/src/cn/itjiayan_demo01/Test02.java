package cn.itjiayan_demo01;



import java.io.File;


public class Test02 {
    public static void main(String[] args) {
        File file = new File("G://Excercise");




        findFile(file);


    }

    private static void findFile(File file) {
        MyFile myFile = new MyFile();
        File[] files = file.listFiles(myFile);
        for (File file1 : files) {

           if(file1.isFile()){
               System.out.println(file1.getName()+"-"+file1.getAbsolutePath());
           }else{

               findFile(file1);
           }


            }

        }



    }

