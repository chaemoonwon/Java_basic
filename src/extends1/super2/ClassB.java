package extends1.super2;

public class ClassB extends ClassA{

//    public ClassB(int a) {
//        super();    //기본 생성자가 있으므로 생략 가능
//        System.out.println("ClassB 생성자 a= " + a);
//    }
//    public ClassB() {
//        this(10);    //기본 생성자가 있으므로 생략 가능
//        System.out.println("ClassB 생성자 a= ");
//    }

    public ClassB(int a) {
//        super();
        this(a,0);    //this를 호출하더라도 반드시 한 번은 super()를 호출해 주어야 함.
        System.out.println("ClassB 생성자 a= " + a);
    }

    public ClassB(int a, int b) {
        super();    //기본 생성자가 있으므로 생략 가능
        System.out.println("ClassB 생성자 a= " + a + ", b= " + b);
    }
}
