package oop1.ex;

public class Rectangle {

    //속성
    int width;
    int height;


    //기능
     int calculateAraa() {
        return width * height;  //넓이
    }

     int calculatePerimeter() {
        return 2 * (width + height);    //둘레 길이
    }

     boolean isSquare() {
        return width == height; //정사각형 여부
    }
}
