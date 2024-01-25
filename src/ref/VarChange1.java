package ref;

public class VarChange1 {

    public static void main(String[] args) {
        int a = 10;
        int b = a;  //값을 복사해서 대입

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a);
        System.out.println("b = " + b);




    }
}
