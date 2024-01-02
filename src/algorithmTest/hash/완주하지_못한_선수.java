package algorithmTest.hash;

import java.util.HashMap;
import java.util.Map;

public class 완주하지_못한_선수 {
    public static String solution(String[] participant, String[] completion) {

        String answer = "";

        Map<String, Integer> result = new HashMap<>();

        for (String key : participant) {
            /**
             * getOrDefault()
             * 찾는 key가 존재하면 찾는 key의 값을 반환하고 없다면 기본 값을 반환
             * 기존의 HashMap은 key 값이 중복되면 덮어쓰기 때문에 defaultValue를 통해서 value를 변경해준다.
             */
            result.put(key, result.getOrDefault(key, 0) + 1);
        }

        for (String com : completion) {
            result.put(com, result.get(com) - 1);
        }

        for (String key : result.keySet()) {
            if (result.get(key) != 0) {
                answer = key;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] arr1 = { "leo", "kiki", "eden", "kiki" };
        String[] arr2 = { "eden", "kiki" };

        String solution = solution(arr1, arr2);
        System.out.println("solution = " + solution);
    }
}
