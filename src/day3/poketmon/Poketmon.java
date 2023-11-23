package day3.poketmon;
public class Poketmon {
    String name;
    Integer hp;
    Integer exp;
    Integer attackDamage;
    Integer level;
    String type;
    Integer x;
    Integer y;

    public Poketmon(String name, Integer hp, Integer exp, Integer attackDamage, Integer level, String type, Integer x, Integer y) {
        this.name = name;
        this.hp = hp;
        this.exp = exp;
        this.attackDamage = attackDamage;
        this.level = level;
        this.type = type;
        this.x = x;
        this.y = y;
    }

    // TODO: 경험치 획득
    Integer getExp(Integer exp) {
        System.out.printf("%d 경험치를 획득하셨습니다.\n", exp);
        this.exp += exp;
        if (this.exp >= 100) {
            this.levelUp();
            this.exp %= 100;
        }

        return this.exp;
    }

    // TODO: 레벨업
    Integer levelUp() {
        this.level++;
        this.attackDamage += this.attackDamage * 20 / 100;
        this.hp += this.hp * 20 / 100;

        System.out.printf("레벨업을 하였습니다(현재 레벨 >> %d). 현재 능력치(공격력: %d, 체력: %d)\n",
                this.level, this.attackDamage, this.hp);

        return this.level;
    }

    // TODO: 공격 관련 기능
    void attackTarget(Poketmon monster) {
        System.out.printf("가랏 %s! %s에게 공격!!\n", this.name, monster.name);
        monster.hp -= attackDamage;
        if (monster.hp <= 0) {
            System.out.println(monster.name + "을 죽였습니다.");
            this.getExp(100);
            monster.die();
        }
        System.out.printf("현재 %s의 남은 채력 %d\n", monster.name, monster.hp);
    }

    void attacked(Poketmon monster) {
        System.out.printf("%s로부터 공격을 받고 있습니다. %s: 아아아아아아아아아아악\n", monster.name, this.name);
        this.hp -= monster.attackDamage;
        if (this.hp <= 0) {
            System.out.println("현재 " + this.name + "이 죽었습니다.");
            die();
        }

        System.out.printf("현재 %s의 남은 체력 %d\n", this.name, this.hp);
    }

    // TODO: 포켓몬 죽음
    void die() {
        hp = 0;
        x = 0;
        y = 0;
    }

    // TODO: 포켓몬 이동
    void move(Integer x, Integer y) {
        this.x += x;
        this.y += y;

        System.out.printf("%s는 %d, %d만큼 이동하였습니다.\n",this.name,  x, y);
        System.out.printf("현재 %s의 위치 (X: %d, Y: %d)\n", this.name, this.x, this.y);
    }

}
