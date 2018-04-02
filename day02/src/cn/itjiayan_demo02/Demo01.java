package cn.itjiayan_demo02;

public class Demo01 {
    public static void main(String[] args) {
        GenericClass<Integer> obj = new GenericClass<>();
        obj.setElement(150);
        System.out.println(obj.getElement());
    }

}
