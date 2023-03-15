package Abstract;

public class Car extends Vehicle{

    Car(String name){
        this.name = name;
    }
    @Override
    void go() {
        System.out.println("The car is moving.");
    }
}
