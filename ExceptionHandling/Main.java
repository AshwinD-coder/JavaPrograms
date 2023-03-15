package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean success  = false;
        do {
            try {
                System.out.println("Enter a whole number to divide: ");
                int x = scanner.nextInt();
                System.out.println("Enter a whole number to divide by: ");
                int y = scanner.nextInt();
                int z = x / y;
                System.out.println("Result: " + z);
                success = true;
            }
            catch (InputMismatchException e){
                System.out.println("Invalid input please enter a number!");
            }
            catch(ArithmeticException e){
                System.out.println("Number cannot be divided by zero,Enter a whole number!");
            }
          finally {
                if(success){
                System.out.println("Success!");}
                else {
                    System.out.println("Try again!");
                }
            }
        }
        while(success);



    }
}
