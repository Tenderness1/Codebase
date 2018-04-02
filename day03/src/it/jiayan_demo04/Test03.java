package it.jiayan_demo04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) {

        Student stu1 = new Student("杨幂",28,90);
        Student stu2 = new Student("热巴",26,98);
        Student stu3 = new Student("张彬彬",28,80);
        Student stu4 = new Student("骚猪",56,80);
        ArrayList<Student> list = new ArrayList<>();
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        list.add(stu4);

       /* Collections.sort(list);
        System.out.println(list);*/

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int c= o1.getScore()-o2.getScore();
                if(c==0){
                    c=o1.getAge()-o2.getAge();
                }
                return c;
            }
        });


        System.out.println(list);
    }
}
