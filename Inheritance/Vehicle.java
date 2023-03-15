package Inheritance;

public class Vehicle {
    double speed;
          void go(){
        System.out.println("This vehicle is moving at " + this.speed +"Km/Hr.");
    }
    void stop(){
        System.out.println("This vehicle is stopping.");
    }
}
