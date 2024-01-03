package algorithmTest.hash;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class 포켓몬 {
    public static int solution(int[] nums) {
        int maxPo = nums.length / 2;

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        if (set.size() > maxPo) {
            return maxPo;
        } else {
            return set.size();
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3, 1, 2, 3 };

        int solution = solution(arr);
        System.out.println("solution = " + solution);
    }
}
