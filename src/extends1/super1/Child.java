package extends1.super1;

public class Child extends Parent{

    public String value = "child";

    @Override
    public void hello() {
        System.out.println("Child.hello");
    }

    public void call() {
        System.out.println("this value = " + this.value);   //this는 자기 자신 참조
        System.out.println("super value = " + super.value); //super는 부모 클래스의 참조

        this.hello();   //this 생략 가능
        super.hello();
    }

}
