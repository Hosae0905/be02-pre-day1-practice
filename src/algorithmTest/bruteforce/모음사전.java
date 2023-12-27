package algorithmTest.bruteforce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 모음사전 {

    static List<String> list;
    static String[] match = { "A", "E", "I", "O", "U" };

    public static int solution(String word) {
        int answer = 0;

        /*String test = "";
        char[] match = { 'A', 'E', 'I', 'O', 'U' };

        for (int i = 0; i < 5; i++) {
            test += "A";
            answer++;
        }

        char[] chars = test.toCharArray();
        char[] wordArr = word.toCharArray();

        while (Arrays.equals(chars, wordArr)) {

        }*/

        list = new ArrayList<>();
        dfs("", 0);
//        int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(word)) {
                answer = i;
                break;
            }
        }
        return answer;
    }

    private static void dfs(String str, int length) {
        list.add(str);
        if (length == 5) return;
        for (int i = 0; i < 5; i++) {
            dfs(str + match[i], length + 1);
        }
    }

    public static void main(String[] args) {
        String str = "AAAAE";
        int solution = solution(str);
        System.out.println("solution = " + solution);
    }
}
