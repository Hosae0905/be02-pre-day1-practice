package level1;

public class 문자열_내_p와_y의_개수 {
    static boolean solution(String s) {
        boolean answer = true;

        int p = 0;
        int y = 0;

        String upperCase = s.toUpperCase();
        char[] charArray = upperCase.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == 'P') p++;
            else if (charArray[i] == 'Y') y++;
        }

        if (p == y) return answer;
        else return false;
    }

    public static void main(String[] args) {
        boolean pPoooyY = solution("Pyy");
        System.out.println("pPoooyY = " + pPoooyY);
    }
}
