package ref;

public class NullMain1 {
    public static void main(String[] args) {
        //null을 사용하는 이유
        //제품은 준비가 되어 있지만 제품을 보낼 주소지가 아직 결정되지 않아서, 주소지가 결정될 대 까지 주소지를 비워두어야 할 때 사용
        //객체(주소지)가 있는 위치를 가리키는 참조값이 있지만. 대상이 없거나, 나중에 입력 하고 싶을 때
        Data data = null;
        System.out.println("data = " + data);
        data = new Data();
        System.out.println("data = " + data);
        data = null;
        System.out.println("data = " + data);
    }
}
