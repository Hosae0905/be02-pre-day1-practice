package day4.flashGame;

public class Start {

    public static void main(String[] args) {
        PlayInfo player1 = new PlayInfo("player1");
        PlayInfo player2 = new PlayInfo("player2");
        Yabawe game = new Yabawe();

        Integer[] number = game.makeNum();

        while (true) {
            Integer pickedNum1 = game.startGame(player1);
            Integer p1 = game.matchNum(number, pickedNum1, player1);
            game.showData(p1, player1);

            Integer pickedNum2 = game.startGame(player2);
            Integer p2 = game.matchNum(number, pickedNum2, player2);
            game.showData(p2, player2);

            if (player1.getScore() == 3) {
                System.out.println("****게임 클리어****");
                break;
            } else if (player1.getHeart() == 0 || player2.getHeart() == 0) {
                System.out.println("아쉽네요. 다음에 도전해 보세요 :)");
                break;
            }
        }
    }
}
