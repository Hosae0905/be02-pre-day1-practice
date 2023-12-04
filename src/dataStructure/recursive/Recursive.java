package dataStructure.recursive;

public class Recursive {

    public int operation1(int num) {
        int result = num;
        for (int i = num - 1; i > 0; i--) {
            result *= i;
        }
        return result;
    }

    public int operation2(int num) {
        if (num > 0) {
            return operation2(num - 1) * num;
        } else {
            return 1;
        }
    }
}
