package poly.ex4;

public class Dog extends AbstractAnimal {


    //추상 메서드에서 정의해준 것을 구현
    @Override
    public void sound() {
        System.out.println("멍멍");
    }

    @Override
    public void move() {
        System.out.println("강아지 움직임");
    }
}
