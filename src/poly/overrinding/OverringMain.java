package poly.overrinding;

public class OverringMain {
    public static void main(String[] args) {
        //자식 변수가 자식 인스턴스 참조
        Child child = new Child();
        System.out.println("Child -> child");
        System.out.println("value = " + child.value);
        child.method();

        System.out.println("====================");

        //부모 변수가 부모 인스턴스 참조
        Parent parent = new Parent();
        System.out.println("Parent -> parent");
        System.out.println("parent = " + parent.value);
        parent.method();

        //부모 변수가 자식 인스턴스 참조
        Parent poly = new Child();
        System.out.println("Parent -> Child");
        System.out.println("poly.value = " + poly.value);   //변수는 overring 되지 않음
        poly.method();  //메소드는 overring 됨

    }
}
