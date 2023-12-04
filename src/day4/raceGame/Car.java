package day4.raceGame;

public class Car {
    private String name;
    private String moveCar = "";

    public Car(String name) {
        this.name = name;
    }

    public void moved() {
        this.moveCar += "-";
    }

    public String getName() {
        return name;
    }

    public String getMoveCar() {
        return moveCar;
    }
}
