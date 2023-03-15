public class Car {
 String model ,color ;
 int year;
 double price;

  Car(String model,String color , int year , double price){
    this.model = model;
    this.color = color;
    this.year = year;
    this.price = price;
     }
 void drive(){
     System.out.println("You are driving " +color +" "+ model);
 }
 void brake(){
     System.out.println("You slowed the car.");
 }

}
