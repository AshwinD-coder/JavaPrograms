package Generics;

public class GenericsClass <T>{
    T name;
    String screentime;
    GenericsClass(T e){
        this.name = e;
    }

    public static void main(String[] args) {
        Generics2 properties = new Generics2();
        GenericsClass<String> name = new GenericsClass<>(properties.name);
        System.out.println(name.name);
        name.screentime = "12hrs/day";
        GenericsClass<Integer> agent = new GenericsClass<>(properties.age);
        System.out.println("Name : "+"Agent"+agent.name);
        System.out.println(name.screentime);
    }
}
 class Generics2{
    String name = "Ashwin Dhougoda";
    int age = 22;

}
