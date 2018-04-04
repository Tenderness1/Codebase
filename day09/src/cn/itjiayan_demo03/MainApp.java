package cn.itjiayan_demo03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();

        System.out.println("请输入学生信息：（格式为：学号，姓名，性别，年龄）");
        for (int i = 0; i < 3; i++) {
            String s = sc.nextLine();
            String[] sss = s.split(",");
            char c = sss[2].trim().charAt(0);
            int a = Integer.valueOf(sss[3].trim());
            Student student = new Student(sss[0].trim(),sss[1].trim(),c,a);

            list.add(student);
        }
        FileOutputStream fos = new FileOutputStream("G://stu2.txt",true);
        for (Student student : list) {
            fos.write((student.getName()+"-").getBytes());
            fos.write((student.getAge()+"-").getBytes());
            fos.write((student.getGender()+"-").getBytes());
            fos.write((student.getId()+"\r\n").getBytes());
        }
        fos.close();

    }
}
