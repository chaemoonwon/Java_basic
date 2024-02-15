package poly.basic;

public class CastingMain2 {
    public static void main(String[] args) {
        Parent poly = new Child();
        //단 자식의 기능은 호출할 수 없다.
//        poly.childMethod();

        // 다운캐스팅(부모 타입 -> 자식 타입)
        //해당 참조값을 꺼내고 참조값이 Child 타입이 됨
//        Child child = (Child) poly;   //생략 불가
//        child.childMethod();

        // 일시적 다운캐스팅 - 해당 메서드를 호출하는 순간만 다운캐스팅
        ((Child) poly).childMethod();

    }
}
