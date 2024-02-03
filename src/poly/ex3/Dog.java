package poly.ex3;

public class Dog extends AbstractAnimal {


    //추상 메서드에서 정의해준 것을 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
