package ref;

public class NullMain2 {
    public static void main(String[] args) {
        Data data = null;
        data.value = 10;    //NullPointerException 예외 발생
        System.out.println("data.value = " + data.value);   //예외가 발생했기 때문에 해당 로직 수행하지 않음
    }
}
