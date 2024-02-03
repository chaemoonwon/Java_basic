package poly.car0;

public class Driver {

    K3Car k3Car;
    Model3Car model3Car;

    public void setK3Car(K3Car k3Car) {
        this.k3Car = k3Car;
    }

    //추가
    //차량을 추가할 때마다 운전자의 코드를 계속해서 추가해야하는 불편함이 생김.
    public void setModel3Car(Model3Car model3Car) {
        this.model3Car = model3Car;
    }

    public void driver() {
        System.out.println("자동차를 운전합니다.");
        if (k3Car != null) {
            k3Car.startEngine();
            k3Car.pressAccelerator();
            k3Car.offEngine();
        } else if(model3Car != null) {
            model3Car.startEngine();
            model3Car.pressAccelerator();
            model3Car.offEngine();
        }
    }

}
