package access.a;

// public 클래스는 반드시 파일명과 이름이 같아야 한다
public class AccessData {
    public int publicField;
    int defaultField;
    private int privateField;

    public void publicMethod() {
        System.out.println("publicMethod 호출" + publicField);
    }

    void defaultMethod() {
        System.out.println("defaultMethod 호출" + defaultField);
    }

    private void privateMethod() {
        System.out.println("privateMethod 호출" + privateField);
    }

    //메서드 내부 호출
    public void innerAccess() {
        System.out.println("내부 호출");
        publicField = 100;
        defaultField = 200;
        privateField = 300;
        publicMethod();
        defaultMethod();
        privateMethod();
    }

}
