package access.ex;

public class Item {


    private String productName;
    private int price;
    private int quantity;

    public Item(String productName, int price, int quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    //인스턴스의 메서드를 호출하면 메서드 영역에 있는 코드를 불러서 수행함.
    //메서드 영역은 공통된 부분이기 때문에, 공통으로 관리되고 실행된다.
    public String getName() {
        return productName;
    }

    public int orderPrice() {
        return price * quantity;
    }
}
