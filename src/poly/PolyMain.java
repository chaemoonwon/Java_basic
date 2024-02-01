package poly;

public class PolyMain {
    public static void main(String[] args) {
        //부모 변수가 부모 인스턴스 참조
        System.out.println("Parent -> Parnet");
        Parent parent = new Parent();
        parent.parentMehtod();

        System.out.println("========================");
        //자식 변수가 자식 인스턴스 참조
        System.out.println("Child -> Child");
        Child child = new Child();
        child.parentMehtod();
        child.childMethod();

        System.out.println("========================");
        //부모 변수가 자식 인스턴스 참조(다형적 참조)
        //부모 타입은 자식 타입을 담을 수 있다.
        System.out.println("Parent -> Child");
        Parent poly = new Child();
        poly.parentMehtod();

//        Child parent1 = new Parent();   //자식 타입은 부모 타입을 담을 수 없다.
                                        //  자식의 기능은 호출 할 수 없다.



    }
}
