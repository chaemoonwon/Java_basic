package poly.car1;

public class NewCar implements Car{

    //OCP(Open-Closed Principle) 원칙
    //기능을 확장할 때 client 부분의 코드는 수정하면 안 됨.
    //확장에는 열려 있고, 코드 수정에는 닫혀 있음.

    @Override
    public void startEngine() {
        System.out.println("NewCar.startEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelerator() {
        System.out.println("NewCar.pressAccelerator");
    }


}
