package poly.ex.pay0;

public class PayService {
    Pay pay;

    public void setPay(Pay pay) {
        this.pay = pay;
    }


    public void processPay(String option, int amount) {
        System.out.println("결제를 시작합니다: option= " + option + ", amount= " + amount);

    pay = findOption(option);
    boolean result = pay.pay(amount);

        if (result) {
        System.out.println("결제가 성공했습니다.");
    } else {
        System.out.println("결제가 실패했습니다.");
    }
}

    private Pay findOption(String option) {
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        } else {
            return new DefaultPay();
        }
    }
}
