package algorithmTest.bruteforce;

public class 최소직삼각형 {
    public static int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;

        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] < sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
            if (maxW < sizes[i][0]) {
                maxW = sizes[i][0];
            }
            if (maxH < sizes[i][1]) {
                maxH = sizes[i][1];
            }
        }
        return maxW * maxH;
    }

    public static void main(String[] args) {
        int[][] arr = { { 60, 50 }, { 30, 70 }, { 60, 30 }, { 80, 40 } };
        int solution = solution(arr);
        System.out.println("solution = " + solution);
    }
}
