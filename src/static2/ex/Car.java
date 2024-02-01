package static2.ex;

public class Car {

    public String name;
    public static int count;        //공통으로 사용하는 변수

    public Car(String name) {
        System.out.println("차량 구입, 이름: " + name);
        count++;
    }

    public static void showTotalCars() {
        System.out.println("구매한 차량 수: " + count);
    }

}
