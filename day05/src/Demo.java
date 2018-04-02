public class Demo {
    public static void main(String[] args) {

        int result = fun();
        System.out.println(result);
    }

    public static int fun() {

        int x = 1;
        try {
            return ++x;
        } catch (Exception e) {
            x = 5;
            return x;
        } finally {
            System.out.println("ssss");
        }
    }


}
