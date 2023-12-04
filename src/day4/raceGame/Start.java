package day4.raceGame;

import java.util.Scanner;

public class Start {

    public void startGame() {
        System.out.print("경주 할 자동차의 수를 입력해 주세요 : ");
        Scanner sc = new Scanner(System.in);
        int raceCar = sc.nextInt();
        Car[] car = new Car[raceCar];

        System.out.print("경주 할 자동차의 이름을 입력해 주세요. (자동차의 수만큼 입력) : ");
        for (int i = 0; i < 3; i++) {
            car[i] = new Car(sc.next());
        }

        System.out.print("경주를 시도할 횟수를 입력해 주세요 : ");
        int tryRace = sc.nextInt();

        for (int i = 0; i < car.length; i++) {
            startRace(tryRace, car[i]);
        }

        showRace(tryRace, car);
    }

    public void startRace(int tryRace, Car car) {
        for (int i = 0; i < tryRace; i++) {
            int num = (int)(Math.random() * 9);
            if (num > 4) {
                car.moved();
            }
        }
    }

    public void showRace(int tryRace, Car[] car) {
        for (int i = 0; i < tryRace; i++) {
            System.out.printf("-----%d번 레이스------\n", i);
            for (int j = 0; j < car.length; j++) {
                System.out.printf("%s : %s\n", car[j].getName(), car[j].getMoveCar());
            }
        }
        showWinner(car);
    }

    public void showWinner(Car[] car) {
        int max = car[0].getMoveCar().length();
        for (int i = 1; i < car.length; i++) {
            if (max < car[i].getMoveCar().length()) {
                max = car[i].getMoveCar().length();
            }
        }

        for (int i = 0; i < car.length; i++) {
            if (car[i].getMoveCar().length() == max) {
                System.out.printf("최종 우승자는 %s 입니다 !!\n", car[i].getName());
            }
        }
    }
}
