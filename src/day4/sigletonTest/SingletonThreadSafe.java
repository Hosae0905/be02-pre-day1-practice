package day4.sigletonTest;

public class SingletonThreadSafe {
    // 싱글톤 클래스의 객체를 담을 변수 생성
    private static SingletonThreadSafe instance;

    // 생성자를 private로 선언하여 외부에서 객체 생성을 금지
    private SingletonThreadSafe() {}

    // 외부에서 싱글톤 객체를 사용하기 위해서는 해당 메서드를 통해서 접근
    // synchronized를 걸어서 하나의 쓰레드만 접근하게 설정
    public static synchronized SingletonThreadSafe getInstance() {
        if (instance == null) {
            instance = new SingletonThreadSafe();
        }
        return instance;
    }
}
