package dataStructure.recursive;

public class RecursiveTest {
    /**
     * 큰 수를 작은 수로 나눴을때 나머지가 0이면 작은 수가 최대 공약수
     * 나머지와 작은 값으로 다시 반복
     */

    public int uClid(int x, int y) {
        if (x % y == 0) return y;
        else return uClid(y, (x % y));
    }
}
