package extends1.ex3;

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

        HydrogenCar hydrogenCar = new HydrogenCar();
        hydrogenCar.move();
        hydrogenCar.openDoor();
        hydrogenCar.fillHydrogen();

    }
}
