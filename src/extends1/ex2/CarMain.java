package extends1.ex2;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();

        GarCar garCar = new GarCar();
        garCar.move();
        garCar.fillUp();
    }
}
