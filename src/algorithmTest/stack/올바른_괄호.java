package algorithmTest.stack;

import java.util.Stack;

public class 올바른_괄호 {
    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        char[] charArray = s.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                stack.push('(');
            } else if (charArray[i] == ')') {
                if (stack.isEmpty()) return false;
                stack.pop();
            }
        }
        return stack.isEmpty();
    }



    public static void main(String[] args) {
        boolean solution = solution("(())()");
        System.out.println("solution = " + solution);
    }
}
