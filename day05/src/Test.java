import java.util.Scanner;

public class Test
{
private  static String[] name={"jack","rose","heise"};

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名");
        String s = sc.nextLine();

        try {
            checkName(s);

            System.out.println("恭喜您，成功注册");
        } catch (NbException e) {


            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("22222222222@@@@@@@@@@@@@@@");
        }
    }

    private static void checkName(String s) throws NbException {

        for (String s1 : name) {
            if(s.equals(s1)){

                throw  new NbException("用户名重复了");
            }
        }

    }
}
