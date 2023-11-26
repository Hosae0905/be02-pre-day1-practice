package day4.sigletonTest;

public class SingletonEager {
    // 싱글톤 클래스 객체를 담는 인스턴스 변수
    private static final SingletonEager INSTANCE = new SingletonEager();

    // 생성자를 private으로 선언하여 외부에서 객체 생성을 금지
    private SingletonEager() {}

    // 외부에서 싱글톤 객체를 사용하기 위해서는 해당 메서드를 통해서 접근
    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
