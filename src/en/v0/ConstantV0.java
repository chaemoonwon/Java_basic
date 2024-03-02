package en.v0;

import en.v2.Fruit;

public class ConstantV0 {

    private static final int FRUIT_APPLE = 1;
    private static final int FRUIT_PEACH = 2;
    private static final int FRUIT_BANANA = 3;


    //final로 지정된 값을 바뀔 수 없음.
    private static final int COMPANY_GOOGLE = 1;
    private static final int COMPANY_APPLE = 2;
    private static final int COMPANY_ORACLE = 3;

    // => APPLE의 변수명이 중복이 됨.

    public static void main(String[] args) {

        /*
        *   1. 사과
        *   2. 복숭아
        *   3. 바나나
        * */
//        int type = 1;
//        switch (type) {
//            case 1:
//                System.out.println(57 + "kcal");
//                break;
//            case 2:
//                System.out.println(57 + "kcal");
//                break;
//            case 3:
//                System.out.println(57 + "kcal");
//                break;
//        }
        // => 숫자만 보고 숫자가 무엇을 뜻하는 지 알 수 없다.

        int type = FRUIT_APPLE;
        switch (type) {
            case FRUIT_APPLE:
                System.out.println(57 + "kcal");
                break;
            case FRUIT_PEACH:
                System.out.println(57 + "kcal");
                break;
            case FRUIT_BANANA:
                System.out.println(57 + "kcal");
                break;
        }
        // => APPLE의 값을 보고 무엇을 뜻하는 지 알 수 있게 됨.


    }
}
