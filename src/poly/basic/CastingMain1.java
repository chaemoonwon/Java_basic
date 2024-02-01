package poly.basic;

import poly.Child;
import poly.Parent;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다.
//        poly.childMethod();

        //다운캐스팅(부모 타입 -> 자식 타입)
        //해당 참조값을 꺼내고 참조값이 Child 타입이 됨
        Child child = (Child) poly;
        child.childMethod();

    }
}
