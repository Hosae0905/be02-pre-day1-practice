package day3.poketmon;

public class FlyPoketmon extends Poketmon {

    Integer z;

    public FlyPoketmon(String name, Integer hp, Integer exp, Integer attackDamage, Integer level, String type, Integer x, Integer y) {
        super(name, hp, exp, attackDamage, level, type, x, y);
    }

    // TODO: 공중 포켓몬 제자리 비행
    void fly(Integer z) {
        this.z = z;
        System.out.printf("%d만큼 날았습니다.\n", this.z);
    }

    // TODO: 공중 포켓몬 비행해서 이동
    @Override
    void move(Integer x, Integer y) {
        this.x += x;
        this.y += y;
        System.out.printf("%d만큼 날아서 %d, %d 만큼 이동했습니다.\n", this.z, x, y);
        System.out.printf("현재 %s의 위치(X: %d, Y: %d)\n", this.name, this.x, this.y);
    }


    // TODO: 공중 포켓몬 착륙
    void land() {
        System.out.printf("%s이 %d, %d 위치에서 착륙했습니다.\n",this.name, this.x, this.y);
        this.z = 0;
    }


}
