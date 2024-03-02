package en.v1;

//인터페이스를 사용한 방법

public class ConstantV1 {
    public static void main(String[] args) {

        if (FRUIT.APPLE == COMPANY.APPLE) {
            //런타임 오류
            System.out.println("과일 애플과 기업 애플은 같은가요?");
        }
    }
}
