package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {

        Rectangle re = new Rectangle();
        re.width = 5;
        re.height = 8;
        
        int area = re.calculateAraa();
        System.out.println("넓이: " +area);

        int perimeter = re.calculatePerimeter();
        System.out.println("둘레 길이: " + perimeter);

        boolean square = re.isSquare();
        System.out.println("정사각형 여부: " + square);

    }
}
