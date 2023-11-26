package day4.sigletonTest;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonLazy {
    // 싱글톤 클래스의 객체를 담을 변수 생성
    private static SingletonLazy instance;

    // 생성자를 private로 선언하여 외부에서 객체 생성을 금지
    private SingletonLazy() {}

    // 외부에서 싱글톤 객체를 사용하기 위해서는 해당 메서드를 통해서 접근
    public static SingletonLazy getInstance() {
        // 메서드를 호출했을 때 싱글톤 객체를 생성했는지 확인하여 초기화를 진행
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}

class LazyTest {
    public static void main(String[] args) {
        SingletonLazy[] singleton = new SingletonLazy[10];

        ExecutorService service = Executors.newCachedThreadPool();

        for (int i = 0; i < 10; i++) {
            final int num = i;
            service.submit(() -> {
                singleton[num] = SingletonLazy.getInstance();
            });
        }

        service.shutdown();

        for (SingletonLazy s : singleton) {
            System.out.println(s.toString());
        }
    }
}