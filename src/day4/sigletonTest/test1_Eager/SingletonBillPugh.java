package day4.sigletonTest.test1_Eager;

public class SingletonBillPugh {
    // 생성자를 private로 선언하여 외부에서 객체 생성을 금지
    private SingletonBillPugh() {}

    // static 내부 클래스 생성
    private static class SingletonInstance {
        // 싱글톤 클래스의 객체를 생성
        private static final SingletonBillPugh INSTANCE = new SingletonBillPugh();
    }

    // 외부에서 싱글톤 객체를 사용하기 위해서는 해당 메서드를 통해서 접근
    public static SingletonBillPugh getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
