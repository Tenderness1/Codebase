package it.jiayan_demo04;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student("张三",15,45);
        Student stu2 = new Student("赵四",45,89);

        Student stu3 = new Student("王五",12,79);
        Student stu4 = new Student("顺溜",13,46);
        Student stu5 = new Student("宝森",46,98);
        Student stu6 = new Student("宝森",46,98);


        HashSet<Student> set = new HashSet<>();
        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        set.add(stu5);
        set.add(stu6);

        Iterator<Student> it = set.iterator();
        int score=0;
        while(it.hasNext()){


            Student s = it.next();
            score+=s.getScore();
        }
        ArrayList<Student> list = new ArrayList<>();
        list.addAll(set);
        Collections.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getScore()-o2.getScore();
            }
        });


        System.out.println("总分为:"+score);
        System.out.println("平均分为"+(score/list.size()));
        System.out.println("最高分为"+list.get(0).getScore());
        System.out.println("最低分为"+list.get(list.size()-1).getScore());



    }
}
