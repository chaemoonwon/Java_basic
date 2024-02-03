package poly.diamond;

public class Child implements InterfaceA, InterfaceB{

    @Override
    public void methodA() {
        System.out.println("Child.methodA");
    }

    @Override
    public void methodB() {
        System.out.println("Child.methodB");
    }

    //양쪽 인터페이스에 기능이 있지만, 같은 메서드 이므로 구현은 1개만 하면 됨.
    @Override
    public void methodCommon() {
        System.out.println("Child.methodCommon");
    }
}
