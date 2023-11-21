package day1;

public class lotto {
    public static void main(String[] args) {
        int[] lottoNum = new int[6];
        lottoNum[0] = (int)(Math.random() * 45) + 1;

        boolean valid = true;

        int i = 1;

        while (valid) {
            lottoNum[i] = (int)(Math.random() * 45) + 1;

            int count = 1;

            for (int j = 0; j < lottoNum.length; j++) {
                if (lottoNum[j] != lottoNum[i]) {
                    count++;
                }
            }

            if (lottoNum.length == count) i++;

            if (i > 5) {
                valid = false;
            }
        }

        for (int j = 0; j < lottoNum.length; j++) {
            System.out.println(lottoNum[j]);
        }
    }
}
