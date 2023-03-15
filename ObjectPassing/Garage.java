package ObjectPassing;

public class Garage {
    String name;
    Garage(String name){
        this.name = name;
    }
    void park(Car car){
        System.out.println("The "+car.name + " is parked in "+name+".");
    }
    void exit(Car car){
        System.out.println("The "+car.name+" exited the garage.");
    }
}
