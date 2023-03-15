package Polymorphism;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Boat boat = new Boat();
        System.out.println("The race is starting in :");
        for (int i =3 ; i>=1 ;i--){
            System.out.println(i);
        }
        Vehicle[] racers = {car,bicycle,boat};
        for(Vehicle x :racers){
            x.go();
        }
    }
}
