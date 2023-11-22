package day3.poketmon;

public class PlayGame {
    public static void main(String[] args) {
        // TODO: 포켓몬 생성
        Pokemon pika = new Pokemon(
                "피카츄",
                240,
                0,
                30,
                1,
                "전기",
                0,
                0
        );



        // TODO: 공중 포켓몬 생성
        FlyPokemon butterfly = new FlyPokemon(
            "버터풀",
                200,
                0,
                15,
                1,
                "곤충",
                0,
                0
        );


        // TODO: 공중 포켓몬 비행하기
        butterfly.fly(10);
        butterfly.move(5, 5);
        butterfly.land();

        // TODO: 포켓몬 공격하기
        pika.attackTarget(butterfly);
        pika.attacked(butterfly);

        // TODO: 포켓몬 이동하기
        pika.move(10, 10);

        // TODO: 포켓몬 죽이기
        while (butterfly.hp > 0) {
            pika.attackTarget(butterfly);
        }
    }
}
