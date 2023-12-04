package day3.lol;

import java.util.Arrays;

public class championInfo{
    String name;
    Integer power;
    Integer attackRange;
    Integer health;
    Integer shield;
    Integer level;
    Integer exp;
    Integer x, y;
    String[] itemList;

    @Override
    public String toString() {
        return "championInfo{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", attackRange=" + attackRange +
                ", health=" + health +
                ", shield=" + shield +
                ", level=" + level +
                ", exp=" + exp +
                ", x=" + x +
                ", y=" + y +
                ", itemList=" + Arrays.toString(itemList) +
                '}';
    }

    public championInfo(String name, Integer power, Integer attackRange, Integer health, Integer shield, Integer level, Integer exp, Integer x, Integer y, String[] itemList) {
        this.name = name;
        this.power = power;
        this.attackRange = attackRange;
        this.health = health;
        this.shield = shield;
        this.level = level;
        this.exp = exp;
        this.x = x;
        this.y = y;
        this.itemList = itemList;
        for (int i = 0; i < itemList.length; i++) {
            this.itemList[i] = "빈칸";
        }
    }

    public championInfo(Integer power) {
        this.power = power;
    }


    public championInfo(String name) {
        this.name = name;
    }

    //TODO: 공격
    Integer attacked(Integer power) {
        this.health -= power;
        if (health <= 0) {
            death();
        }
        return this.health;
    }

    Integer attacked(Integer damage, Integer number) {
        this.health -= (power * number);
        if (health <= 0) {
            death();
        }
        return this.health;
    }

    void attackTo(championInfo target) {

        Integer random = (int)(Math.random() * 100) + 1;

        if (random >= 90) {
            target.attacked(power, 3);
        } else if (random >= 80) {
            target.attacked(power, 2);
        } else {
            target.attacked(power);
        }
    }

    void attackTo(String mob) {
        expUp(mob);
    }

    //TODO: 경험치업
    Integer expUp(String enemy) {
        if (enemy.equals("미니언")) {
            exp += 10;
        } else if (enemy.equals("용")) {
            exp += 50;
        } else if (enemy.equals("타워")) {
            exp += 100;
        }

        if (exp >= 100) {
            this.levelUp();
            exp %= 100;
        }

        return exp;
    }
    //TODO: 레벨업
    Integer levelUp() {
        level++;
        power += (power * 100 / 1000);
        shield += (shield * 105 / 1000);
        health += (health * 120 / 1000);
        return level;
    }

    //TODO: 이동
    void move(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    //TODO: 귀환
    void recall() {
        x = 0;
        y = 0;
    }

    //TODO: 죽음
    void death() {
        this.recall();

        health = 100;
    }

    //TODO: 아이템 구매
    String[] buyItem(String item) {

        for (int i = 0; i < this.itemList.length; i++) {
            if (this.itemList[i].equals("빈칸")) {
                this.itemList[i] = item;
            }
        }

        return itemList;
    }

}
