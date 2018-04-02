package it.jiayan_Demo01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("rose",18));
        list.add(new Student("jack",28));
        list.add(new Student("tank",15));
        list.add(new Student("faker",23));
        for (Student student : list) {
            System.out.println(student);
        }

      /*  Collections.sort(list);
        System.out.println("-----------");
        for (Student student : list) {
            System.out.println(student);
        }
*/

        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int a= o2.getAge()-o1.getAge();
                if(a==0){
                     a = o1.getName().charAt(0) - o2.getName().charAt(0);
                }
                return a;
            }
        });


        System.out.println(list);
    }
}
