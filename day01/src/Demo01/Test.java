package Demo01;



import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
    public static void main(String[] args) throws ParseException {
        Date d1 = new Date();
        /*System.out.println(d1.getTime());

        System.out.println(d1);
        System.out.println(new Date(1000*60*60));*/
        System.out.println(d1);
        String str ="1996-03-08";

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date s = sdf.parse(str);

        System.out.println(s);
        long a=d1.getTime()-s.getTime();
        System.out.println(a/1000/60/60/24);





    }

}
