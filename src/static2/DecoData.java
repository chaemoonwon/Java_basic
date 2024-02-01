package static2;

public class DecoData {

    private int instanceValue;
    private static int staticValue;

    public static void staticCall() {
        //인스턴스에 접근할 수 있는 참조값을 알 수 없음.
//        instanceValue++;      //인스턴스 변수 접근 불가
//        instanceMethod();     //인스턴스 메서드 접근 불가

        staticValue++;
        staticMethod();
    }

    public static void staticCall(DecoData decoData) {
        decoData.instanceValue++;
        decoData.instanceMethod();
    }

    private void instanceMethod() {
        System.out.println("instaceCalue=" + instanceValue);
    }

    public void instanceCall() {

        instanceValue++;      //인스턴스 변수
        instanceMethod();     //인스턴스 메서드

        staticValue++;
        staticMethod();
    }

    private static void staticMethod() {
        System.out.println("staticValue=" + staticValue);
    }


}
