package day3.studentEx;

public class Student {
    String name;
    Integer age;
    String gender;

    Integer fullness;
    Integer intell;

    Integer eating(String menu, Integer amount) {
        fullness += amount;

        return fullness;
    }

    Integer study(String subject, Integer time) {
        intell += (2 *time);
        return intell;
    }
}
