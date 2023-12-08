package algorithmTest.level1;

public class 서울에서_김서방_찾기 {
    public static String solution(String[] seoul) {

        int place = 0;

        /*for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].startsWith("K") || seoul[i].startsWith("k")) {      // contains --> startsWith로 변경
                place = i;
                break;
            }
        }*/

        for (int i = 0; i < seoul.length; i++) {
            if(seoul[i].startsWith("Kim")) {      // contains --> startsWith로 변경
                place = i;
                break;
            }
        }

        return "김서방은 " + place + "에 있다.";
    }

    public static void main(String[] args) {

        String[] str = {"Jane", "aKc", "kwe", "Kim"};

        System.out.println(solution(str));
    }
}
