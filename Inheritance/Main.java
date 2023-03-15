package Inheritance;

public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle();
        Car car = new Car();
        car.speed = 120.23;
        bicycle.speed = 10.11;
        car.go();
        System.out.println("The car has "+car.doors +" doors"+" and "+car.wheels +" wheels.");
        bicycle.go();
        bicycle.stop();
    }
}
