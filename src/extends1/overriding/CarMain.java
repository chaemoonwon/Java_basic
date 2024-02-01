package extends1.overriding;

public class CarMain {
    public static void main(String[] args) {
        ElectricCar electricCar = new ElectricCar();
        electricCar.move();
        electricCar.charge();
        electricCar.openDoor();

        GarCar garCar = new GarCar();
        garCar.move();
        garCar.openDoor();
        garCar.fillUp();

    }
}
