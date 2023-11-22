package day3.studentEx;

public class Ex1 {
    public static void main(String[] args) {
        Student stu = new Student();

        stu.name = "test";
        stu.age = 10;
        stu.gender = "남자";
        stu.fullness = 50;
        stu.intell = 10;

        Integer intellResult = stu.study("알고리즘", 5);
        Integer fullResult = stu.eating("주먹밥", 20);

        System.out.println("intellResult = " + intellResult);
        System.out.println("fullResult = " + fullResult);
    }
}
