package it.jiayan_demo03;

import java.util.HashSet;

public class Test {

    public static void main(String[] args) {
        HashSet<Student> s = new HashSet<>();
        Student s1 = new Student("张三",15,'男');
        Student s2 = new Student("李四",17,'女');
        Student s3 = new Student("张三",15,'男');
        Student s4 = new Student("王五",15,'男');
        Student s5 = new Student("啦啦",15,'男');
        s.add(s1);
        s.add(s2);
        s.add(s3);
        s.add(s4);
        s.add(s5);
        for (Student student : s) {
            System.out.println(student);
        }

    }
}
