package cn.itjiayan_demo04;

import java.util.Arrays;
import java.util.Comparator;

public class Test03 {
    public static void main(String[] args) {
        Student s1 = new Student("jack", 99);
        Student s2 = new Student("rose", 96);
        Student s3 = new Student("heisi", 98);

        Student[] students = {s1, s2, s3};

        Arrays.sort(students, (Student o1, Student o2) -> o1.getScore() - o2.getScore());


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getName()+"--"+students[i].getScore());
        }
    }
}
