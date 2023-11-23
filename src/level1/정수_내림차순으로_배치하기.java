package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class 정수_내림차순으로_배치하기 {
    public static long solution(long n) {

//        List<Long> list = new ArrayList<>();
//
//        while (n > 0) {
//            long l = n % 10;
//            list.add(l);
//            n /= 10;
//        }
//
//        list.sort(new Comparator<Long>() {
//            @Override
//            public int compare(Long o1, Long o2) {
//                if(o1 < o2) return 1;
//                else return 0;
//            }
//        });

        String[] str = String.valueOf(n).split("");
        Arrays.sort(str);

        StringBuilder sb = new StringBuilder();
        for (String strList : str) {
            sb.append(strList);
        }
        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        long solution = solution(118372);
        System.out.println(solution);
    }
}
