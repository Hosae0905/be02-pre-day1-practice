package dataStructure.recursive;

public class RecursiveMain {
    public static void main(String[] args) {
        Recursive recursive = new Recursive();
        System.out.println(recursive.operation1(5));
        System.out.println(recursive.operation2(5));

        RecursiveTest test = new RecursiveTest();
        System.out.println(test.uClid(22, 8));

        Hanoi hanoi = new Hanoi();
        hanoi.hanoiTest(1,2,3,3);
    }
}
