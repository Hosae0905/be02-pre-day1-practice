package day4.sigletonTest.test1_Eager;

public enum SingletonEnum {
    // enum에서 변수는 처음부터 private으로 설정된다.
    INSTANCE;

    public static void toSomething() {
        // do something
    }
}
