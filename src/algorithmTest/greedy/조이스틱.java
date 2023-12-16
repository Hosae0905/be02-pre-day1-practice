package algorithmTest.greedy;

public class 조이스틱 {
    public static int solution(String name) {
        /*int answer = 0;
        char[] arr = new char[name.length()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 'A';
        }

        char[] nameArr = name.toCharArray();
        String test = "";
        int index = 0;

        while (!name.equals(test)) {
            if (nameArr[index] == 'A') {
                answer++;
                test += 'A';
                index++;
            } else {
                if (nameArr[index] - arr[index] <= 12) {
                    // 조이스틱 위쪽
                    while (!(arr[index] == nameArr[index])) {
                        arr[index]++;
                        answer++;
                    }
                } else {
                    // 조이스틱 아래쪽
                    arr[index] = 'Z';
                    while (!(arr[index] == nameArr[index])) {
                        arr[index]--;
                        answer++;
                    }
                }
                test += arr[index];
                index++;
                answer++;
            }
        }

        return answer;*/

        int answer = 0;
        int move = name.length() - 1;

        for (int i = 0; i < name.length(); i++) {
            answer += Math.min(name.charAt(i) - 'A', 26 - (name.charAt(i) - 'A'));
            if (i < name.length() - 1 && name.charAt(i + 1) == 'A') {
                int endA = i + 1;
                while (endA < name.length() && name.charAt(endA) == 'A') {
                    endA++;
                }

                move = Math.min(move, i * 2 + (name.length() - endA));
                move = Math.min(move, i + (name.length() - endA) * 2);
            }
        }

        return answer + move;
    }

    public static void main(String[] args) {
        int solution = solution("JEROEN");
//        int solution = solution("JAN");
        System.out.println("solution = " + solution);
    }
}
