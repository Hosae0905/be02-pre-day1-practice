package level1;

public class 두_정수_사이의_합 {
    public static long solution(int a, int b) {

        long sum = 0;

        /*if (a == b) {
            return (long)a;
        } else if (b > a) {
            for (int i = a; i < b; i++) {
                sum += (++i);
            }
            return sum + a + b;
        } else {
            for (int i = a; i > b; i--) {
                sum += (--i);
            }
            return sum + a + b;
        }*/

        if (a == b) {
            return (long)a;
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = a; i >= b; i--) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(solution(5, 3));

    }
}
