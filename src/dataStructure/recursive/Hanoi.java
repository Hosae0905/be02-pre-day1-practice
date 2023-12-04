package dataStructure.recursive;

public class Hanoi {

    public void hanoiTest(int from, int mid, int to, int value) {
        if (value >= 1) {
            hanoiTest(from, to, mid, value - 1);
            System.out.printf("%d번 원반을 %d번에서 %d번으로 옮겼다.\n", value, from, to);
            hanoiTest(mid, from, to, value - 1);
        }
    }
}
