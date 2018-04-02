package cn.itjiayan_Demo01;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("啊",15,'男');
        Student s2 = new Student("xix",28,'女');
        Student s3 = new Student("sss",45,'男');

        ArrayList<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (Student s : list) {
            System.out.println(s);
        }

        int max = list.get(0).getAge();
        int index=0;

        for (int i = 0; i < list.size(); i++) {

            if(list.get(i).getAge()>max){
                index=i;
            }

        }

        list.get(index).setName("小猪佩奇");

        for (Student student : list) {
            System.out.println(student);
        }
    }
}
