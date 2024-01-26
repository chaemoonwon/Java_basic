package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        //여러 상품의 주문정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];
        //상품의 주문 정보를 ProductOrder타입의 변수로 받아 저장
        productOrders[0] = crateOrder("두부", 2000,2);
        productOrders[1] = crateOrder("김치",5000,1);
        productOrders[2] = crateOrder("콜라",1500,2);

        //상품 주문 정보와 최종 결제 금액 출력
        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    // 상품 주문 정보를 생성
    static ProductOrder crateOrder(String productName, int price, int quantity) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.productName = productName;
        productOrder.price = price;
        productOrder.quantity = quantity;
        return productOrder;
    }

    // 상품 주문 정보 출력
    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명: " + order.productName + ", 갸격: " + order.price + ", 수량: " + order.quantity);
        }
    }

    // 총 결제 금액 계산
    static int getTotalAmount(ProductOrder[] orders) {
        int sum = 0;
        for (ProductOrder order : orders) {
            sum += (order.price * order.quantity);
        }
        return sum;
    }
}
