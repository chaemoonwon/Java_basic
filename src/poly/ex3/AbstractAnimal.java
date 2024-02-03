package poly.ex3;

public abstract class AbstractAnimal {

    //추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 함
    //추상 클래스는 상속을 받아야 함
    //추상 클래스는 직접 생성자를 생성해서 사용할 수 없다.

    //1.
    //오버라이딩 목적으로 사용하는 추상 메서드
    public abstract void sound();
    //추상 메서드는 메서드 바디가 없음
    //추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용해야 한다.

    //2.
    //상속받아서 사용하는 일반 메서드
    public void move() {
        System.out.println("동물이 움직입니다.");
    }

}
