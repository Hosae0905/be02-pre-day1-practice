package algorithmTest.level1;

public class 문자열을_정수로_바꾸기 {
    public static int solution(String s) {

        //TODO: 첫 번째로 시도한 코드
//        int answer = Integer.parseInt(s);


        //TODO: 두 번째로 시도한 코드
//        char[] charArray = s.toCharArray();
//
//        if (charArray[0] == '-') {
//            String str = "";
//            for (int i = 1; i < charArray.length; i++) {
//                str += charArray[i];
//            }
//        } else {
//
//        }

        boolean sign = true;
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-') sign = false;
            else if (c != '+') result = result * 10 + (c - '0');
        }

        return sign ? 1 * result : -1 * result;
    }

    public static void main(String[] args) {
        int solution = solution("+1234");
        System.out.println(solution);
    }
}
