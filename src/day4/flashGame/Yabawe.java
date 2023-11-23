package day4.flashGame;

import java.util.Scanner;

public class Yabawe {

    public Integer startGame(PlayInfo player) {
        System.out.printf("%s님 번호를 선택해 주세요. (1 ~ 3): ", player.getName());
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public Integer[] makeNum() {
        Integer[] arr = new Integer[3];

        for (int i = 0; i < arr.length; i++) {
            int num = (int)(Math.random() * 3) + 1;

            for (int j = 0; j < i; j++) {
                if (arr[j] == num) {
                    num = (int)(Math.random() * 3) + 1;
                    j--;
                }
            }
            arr[i] = num;
        }
        return arr;
    }

    public Integer matchNum(Integer[] number, int num, PlayInfo player) {
        if (number[num - 1] == 1) {
            if (player.getHeart() > 0) {
                player.setHeart(-1);
            }
            return check("꽝");
            
        } else if (number[num - 1] == 2) {
            return check("정답");
            
        } else {
            player.setHeart(-1);
            return check("폭탄");
        }
    }

    private Integer check(String str) {
        if (str.equals("꽝")) {
            return 1;
        } else if (str.equals("정답")) {
            return 2;
        } else {
            return 3;
        }
    }

    public void showData(Integer num, PlayInfo player) {
        if (num == 1) {
            player.inCollect();
            System.out.println("꽝 입니다. :(");
            System.out.printf("%s님은 현재 하트 %d개 남았습니다. :(\n", player.getName(), player.getHeart());
        } else if (num == 2) {
            player.collect();
            System.out.println("정답 입니다 !! :)");
            System.out.printf("현재 점수는 %d점 입니다.\n", player.getScore());

        } else {
            if (player.getScore() > 0) {
                player.boom();
            }
            System.out.println("폭탄 받아라!!!! (펑) (펑)");
            System.out.printf("%s님은 현재 하트 %d개 남았습니다. :(\n", player.getName(), player.getHeart());
            System.out.printf("현재 점수는 %d점 입니다.\n", player.getScore());
        }
    }
}
