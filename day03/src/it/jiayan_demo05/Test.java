package it.jiayan_demo05;

import java.util.HashSet;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",18);
        Student stu2 = new Student("李四",19);
        Student stu3 = new Student("王五",19);
        Student stu4 = new Student("赵六",19);



        HashSet<Student> classes1 = new HashSet<>();
        HashSet<Student> classes2 = new HashSet<>();
        classes1.add(stu1);
        classes1.add(stu2);
        classes2.add(stu3);
        classes2.add(stu4);
        HashSet<HashSet> subjects = new HashSet<>();
        subjects.add(classes1);
        subjects.add(classes2);
        for (HashSet set : subjects) {
            for (Object o : set) {
                Student o1 = (Student) o;
                System.out.println(o1);
            }
        }

        Iterator<HashSet> it = subjects.iterator();
        while(it.hasNext()){
            HashSet set1 = it.next();
            Iterator it2 = set1.iterator();
            while(it2.hasNext()){

                Object o = it2.next();
                System.out.println((Student)o);
            }


        }


    }
}
