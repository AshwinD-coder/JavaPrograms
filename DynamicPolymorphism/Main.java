package DynamicPolymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[]  args){
        Animal animal;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What animal would you like to choose: ");
        System.out.print("1==Dog OR 2==Cat  :");
        int choice = scanner.nextInt();
        if(choice == 1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice == 2){
            animal = new Cat();
            animal.speak();
        }
        else{
            System.out.println("Invalid choice...");
            animal = new Animal();
            animal.speak();
        }
    }
}
