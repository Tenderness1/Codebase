package it.jiayan_demo02;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();
        Student p1 = new Student("马云",46);
        Student p2 = new Student("马化腾",42);
        Student p3 = new Student("马冬梅",22);
        Student p4 = new Student("马赛克",18);

        map.put("杭州",p1);
        map.put("深圳",p2);
        map.put("北京",p3);
        map.put("东京",p4);

        Set<String> set = map.keySet();
        for (String s : set) {
            Student student = map.get(s);
            System.out.println(s+"-"+student.getName()+"，"+student.getAge());
        }


        System.out.println("==============================================");


        Set<Map.Entry<String, Student>> set1 = map.entrySet();
        Iterator<Map.Entry<String, Student>> itt = set1.iterator();
        while(itt.hasNext()){

            Map.Entry<String, Student> next = itt.next();
            System.out.println(next.getKey()+":"+next.getValue().getName()+":"+next.getValue().getAge());

        }



        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");


        HashMap<Student, String> hashMap = new HashMap<>();

        Student s1 = new Student("马云",46);
        Student s2 = new Student("马化腾",42);
        Student s3 = new Student("马冬梅",22);
        Student s4 = new Student("马赛克",18);
        Student s5 = new Student("马赛克",18);


        hashMap.put(s1,"杭州");
        hashMap.put(s2,"深圳");
        hashMap.put(s3,"北京");
        hashMap.put(s4,"东京");
        hashMap.put(s5,"西安");

        Set<Student> keySet = hashMap.keySet();
        for (Student stu : keySet) {
            String s = hashMap.get(stu);

            System.out.println(s+","+stu.getName()+":"+stu.getAge());
        }

    }
}
