package Demo01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        SimpleDateFormat fo = new SimpleDateFormat("yyyy年MM月dd日HH小时mm分钟ss秒");
        SimpleDateFormat foo = new SimpleDateFormat("yyyy年MM月dd日");
        SimpleDateFormat ssss = new SimpleDateFormat("yyyy-MM-dd");
        String s = foo.format(date);
        System.out.println(s);

        String ss="1998-05-23 12:22:30";

        Date date1 =ssss.parse(ss);
        System.out.println(date1);

        String sss="2018-03-04";
        Date p = ssss.parse(sss);
        String s1 = foo.format(p);


        System.out.println(s1);

        System.out.println("请输入日期 格式为xxxx年xx月xx日:");

        Scanner sc = new Scanner(System.in);
        String s2 = sc.nextLine();
        Date date2 = foo.parse(s2);



        Calendar instance = Calendar.getInstance();

        instance.setTime(date2);
       // System.out.println(instance.get(Calendar.DAY_OF_MONTH));
        //System.out.println(instance.get(Calendar.DAY_OF_WEEK));

        int i = instance.get(Calendar.DAY_OF_WEEK);
        switch (i){
            case 1:
                System.out.println("是周日");
            break;
            case 2:
                System.out.println("是周一");
                break;
            case 3:
                System.out.println("是周二");
                break;
            case 4:
                System.out.println("是周三");
                break;
            case 5:
                System.out.println("是周四");
                break;
            case 6:
                System.out.println("是周五");
                break;
            case 7:
                System.out.println("是周六");
                break;


        }



    }

}
