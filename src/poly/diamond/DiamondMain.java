package poly.diamond;

public class DiamondMain {
    public static void main(String[] args) {
        InterfaceA a = new Child();
        //인터페이스A 타입의 a 변수에 생성한 참조값에 methodA가 오버라이드 되어 있는 지 확인함
        a.methodA();
        a.methodCommon();

        InterfaceB b = new Child();
        b.methodB();
        b.methodCommon();

    }
}
