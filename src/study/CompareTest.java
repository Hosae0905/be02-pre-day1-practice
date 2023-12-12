package study;

import java.util.Comparator;

public class CompareTest {
    public static void main(String[] args) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        System.out.println("min - 1 = " + (1 - min));
        System.out.println("max + 1 = " + (1 + max));

        Comparator<Student> test1 = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.classNumber - o2.classNumber;
            }
        };
    }

    public static Comparator<Student> test2 = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.classNumber - o2.classNumber;
        }
    };
}
