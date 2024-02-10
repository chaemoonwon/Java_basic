package extends1.super2;

public class Super2Main {
    public static void main(String[] args) {
        ClassC classC = new ClassC();
        System.out.println("classC = " + classC);

        ClassB classB = new ClassB(100);
        System.out.println("classB = " + classB);
    }
}
