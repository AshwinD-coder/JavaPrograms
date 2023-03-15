package Abstract;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Mustang GT");
        System.out.print(car.name+"----->"+"\t");
        car.go();
    }
}
