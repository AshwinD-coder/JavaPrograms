package ArrayofObjects;

public class Food {
    String name;
    Food(String name){
        this.name = name;
    }
    void eat(){
        System.out.println("You are eating "+this.name);
    }
}
