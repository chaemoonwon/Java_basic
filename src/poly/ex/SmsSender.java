package poly.ex;

public class SmsSender implements Sender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms를 발송합니다: " + message);
    }
}
