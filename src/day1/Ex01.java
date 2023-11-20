package day1;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1;
        num1=10;

        Integer num2;
        num2=20;

//        System.out.println(num1);
//        System.out.println(num2);

        System.out.println("---------바뀌기 전------------");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("---------바뀐 후------------");

        Integer temp;

        temp = num2;
        num2 = num1;
        num1 = temp;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }
}
