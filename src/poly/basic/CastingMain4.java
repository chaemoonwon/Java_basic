package poly.basic;

//다운캐스팅을 자동으로 하지 않는 이유(다운 캐스팅의 문제점)
public class CastingMain4 {
    public static void main(String[] args) {
        Parent parent1 = new Child();
        Child child1 = (Child) parent1;
        child1.childMethod();   //문제 없음 => Child 클래스 타입 참조

        Parent parent2 = new Parent();
        Child child2 = (Child) parent2; //런타임 오류 - ClassCastException
        child2.childMethod();   //실행 불가 => Child 클래스 타입을 참조할 수 없음
                                //Child클래스의 인스턴스를 생성해주지 않았기 때문에.
    }

}
