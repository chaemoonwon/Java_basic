package final1;

public class FinalFieldMain {
    public static void main(String[] args) {
        //final 필드 - 생성자 초기화
        //생성자 초기화는 인스턴스를 생성할 때 값을 할당 할 수 있으므로, 생성 할때 값을 변경해 줄 수 있음.
        System.out.println("생성자 초기화");
        ConstructInit constructInit1 = new ConstructInit(10);
        ConstructInit constructInit2 = new ConstructInit(20);
        System.out.println("constructInit1 = " + constructInit1.value);
        System.out.println("constructInit2 = " + constructInit2.value);

        //final 필드 - 필드 초기화
        //필드 초기화는 인스턴스를 생성하더라도 값을 변경할 수 없음.
        //중복으로 인한 메모리 낭비
        System.out.println("필드 초기화");
        FieldInit fieldInit1 = new FieldInit();
        FieldInit fieldInit2 = new FieldInit();
        FieldInit fieldInit3 = new FieldInit();
        System.out.println(fieldInit1.value);
        System.out.println(fieldInit2.value);
        System.out.println(fieldInit3.value);

        //상수
        //static 영역이므로 클래스에 접근해서 사용할 수 있음.
        System.out.println("상수");
        System.out.println(FieldInit.CONST_VALUE);


    }
}
