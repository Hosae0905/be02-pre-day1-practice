package day3.lol;

public class playGame {
    public static void main(String[] args) {
        championInfo garen = new championInfo(
                "가렌",
                70,
                100,
                580,
                52,
                1,
                0,
                0,
                0,
                new String[6]);

        championInfo darius = new championInfo(
                "다리우스",
                62,
                175,
                630,
                44,
                1,
                0,
                0,
                0,
                new String[6]);

        garen.attackTo(darius);
        System.out.println(garen.level);

        darius.attackTo(garen);
        System.out.println(garen.health);

        System.out.println(garen.toString());

        championInfo jinx = new championInfo(100);
    }
}
