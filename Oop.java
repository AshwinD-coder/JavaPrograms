public class Oop {
    public static void main(String[] args){

        //object - an instance of class that may contain attributes(states) and methods(actions or behaviour)
        Car myCar =  new Car("Lamborghini","Yellow",2000,200000.00);
        Car mySecondCar = new Car("Tesla" , "Black", 2000 , 4999999.899);
        myCar.drive();
        myCar.brake();
        System.out.println();
        mySecondCar.drive();

        DiceRoller dice = new DiceRoller();
    }
}
