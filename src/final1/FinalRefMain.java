package final1;

public class FinalRefMain {
    public static void main(String[] args) {
        final Data data = new Data();       //참조형
        //참조 값은 변경 불가
        //다른 객체를 참조 불가능


        //참조 대상의 값은 변경 가능
        data.value = 10;
        System.out.println("data.value = " + data.value);
        data.value = 20;
        System.out.println("data.value = " + data.value);

    }
}
