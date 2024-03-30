package lamda;

import java.io.FilenameFilter;

public class LambdaEx {

    public static void main(String[] args) {
        //람다식, 익명 객체
//        Object obj = (a, b) -> a > b ? a : b;

        //람다식을 이용하기 위해서는 참조할 타입이 필요함.
        Object obj = new Object() {
            int max(int a, int b) {
                return a > b? a:b;
            }
        };
        //해당 max 함수는 익명 객체이기 때문에 존재하지 않음.
        int value = obj.max(3,5);       // 이 함수를 이용하기 위해서는 함수형 인터페이스가 필요함




//
//        (name, i) -> System.out.println(name + "=" +i);


    }
}
