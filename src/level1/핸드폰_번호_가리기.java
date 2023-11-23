package level1;

import java.util.Arrays;

public class 핸드폰_번호_가리기 {
    public static String solution(String phone_number) {

        char[] charArray = phone_number.toCharArray();
        String str = "";

        for (int i = 0; i < charArray.length - 4; i++) {
            charArray[i] = '*';
        }

        for (int i = 0; i < charArray.length; i++) {
            str += charArray[i];
        }

        return str;
    }

    public static void main(String[] args) {
        String solution = solution("027778888");
        System.out.println("solution = " + solution);
    }
}
