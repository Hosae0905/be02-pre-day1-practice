package day1;

public class Ex04 {
    public static void main(String[] args) {

        while (true) {
            Player player1 = new Player("player1", (int)(Math.random() * 3) + 1);
            Player player2 = new Player("player2", (int)(Math.random() * 3) + 1);

            if (player1.mugi == player2.mugi) continue;
            else if (player1.mugi == 1 && player2.mugi == 2) {
                System.out.println(player2.name);
                break;
            } else if (player1.mugi == 1 && player2.mugi == 3) {
                System.out.println(player1.name);
                break;
            }
        }
    }
}

class Player {
    String name;
    int mugi;

    Player(String name, int mugi) {
        this.name = name;
        this.mugi = mugi;
    }

}
