package day4.sigletonTest.test1_Eager;

public class SingletonStaticBlock {
    // 싱글톤 클래스 객체를 담을 인스턴스 변수 생성
    private static SingletonStaticBlock instance;

    // 생성자를 private로 선언하여 외부에서 객체 생성을 금지
    private SingletonStaticBlock() {}

    // static 블록을 활용하여 예외 처리
    static {
        try {
            instance = new SingletonStaticBlock();
        } catch (Exception e) {
            throw new RuntimeException("객체 생성 오류");
        }
    }

    // 외부에서 싱글톤 객체를 사용하기 위해서는 해당 메서드를 통해서 접근
    public static SingletonStaticBlock getInstance() {
        return instance;
    }
}
