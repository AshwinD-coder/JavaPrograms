package ObjectPassing;

public class main {
    public static void main(String[] args) {
        Garage garage = new Garage("Ashwin's Garage and Workshop");
        Car car = new Car("Supra");
        garage.park(car);
        garage.exit(car);
    }
}
