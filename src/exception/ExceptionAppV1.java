package exception;

public class ExceptionAppV1 {
    public static void main(String[] args) {

        System.out.println(1);
        exception();
        System.out.println(3);
    }

    //예외 상황에 대한 대응
    private static void exception() {
        int[] scores = {10, 20, 30};

        try {
            System.out.println(scores[3]);
            System.out.println(2 / 0);        //예외 처리를 해주어야 함(예외적 상황에 대한 대응)
        } catch (ArithmeticException e) {
            System.out.println("잘못된 계산이네요");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("없는 값이예요.");
        }
    }
}
