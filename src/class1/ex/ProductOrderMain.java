package class1.ex;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder productOrder1 = new ProductOrder();
        ProductOrder productOrder2 = new ProductOrder();
        ProductOrder productOrder3 = new ProductOrder();

        productOrder1.productName = "두부";
        productOrder1.price = 2000;
        productOrder1.quantity = 2;

        productOrder2.productName = "김치";
        productOrder2.price = 5000;
        productOrder2.quantity = 1;

        productOrder3.productName = "콜라";
        productOrder3.price = 1500;
        productOrder3.quantity = 2;
        //여러 상품의 주문정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[3];

        //상품의 주문 정보를 ProductOrder타입의 변수로 받아 저장
        productOrders[0] = productOrder1;
        productOrders[1] = productOrder2;
        productOrders[2] = productOrder3;



        //상품 주문 정보와 최종 결제 금액 출력
        int sum = 0;
        for (int i = 0; i < productOrders.length; i++) {
            sum += (productOrders[i].price * productOrders[i].quantity);
            System.out.println("상품명: " + productOrders[i].productName + ", 갸격: " + productOrders[i].price + ", 수량: " + productOrders[i].quantity);
        }

        System.out.println("총 결제 금액: " + sum);

    }
}
