package extends1.super2;

public class ClassC extends ClassB{

    public ClassC() {
        super(10,20);   //기본 생성자가 없으므로 직접 매개변수를 정의해주어야 함.
        System.out.println("ClassC 생성자");
    }
}
