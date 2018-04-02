package Demo02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        Student s1 = new Student("jack",65);
        Student s2 = new Student("rose",95);
        Student s3 = new Student("leisi",65);
        Student s4 = new Student("heisi",-32);
        ArrayList<Student> list = new ArrayList<>();
        Collections.addAll(list,s1,s2,s3,s4);

        for (Student student : list) {

            try {
                checkScore(student.getScore());
            } catch (FuShuException e) {
                System.out.println(student);
                e.printStackTrace();
            }
        }

    }

    private static void checkScore(int score) throws FuShuException {

        if(score<0){
throw new FuShuException("老弟啊，分数不能为负数");
        }

    }
}
