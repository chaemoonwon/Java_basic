package ref.ex;

import java.util.Scanner;

public class ProductOrderMain3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력할 주문의 개수를 입력하세요: ");
        int orderCount = sc.nextInt();

        //여러 상품의 주문정보를 담는 배열 생성
        ProductOrder[] productOrders = new ProductOrder[orderCount];
        //생성한 주문정보를 배열에 저장
        productOrders[0] = crateOrder();
        productOrders[1] = crateOrder();
        productOrders[2] = crateOrder();

        //배열에 입력
        for (int i = 0; i < orderCount; i++) {
            System.out.println((i + 1) + "번째 주문 정보를 입력하세요");
            System.out.print("상품명: ");
            productOrders[i].productName = sc.next();
            System.out.print("갸격: ");
            productOrders[i].price = sc.nextInt();
            System.out.print("수량: ");
            productOrders[i].quantity = sc.nextInt();
        }

        printOrders(productOrders);
        int totalAmount = getTotalAmount(productOrders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder crateOrder() {
        return new ProductOrder();
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
