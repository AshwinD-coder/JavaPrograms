import java.util.Scanner;
public class Conditionalstatements {
    public static void main(String[] args) {
        int x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age: ");
        x = scanner.nextInt();
        if(x>=50){                                          //If statements
            System.out.println("Ok Boomer. ");
        }
        else if(x>18){
            System.out.println("You are an adult.");
        }
        else{
            System.out.println("Ok Zoomer.");
        }
        System.out.println("Choose your option:");
        System.out.println("1.Eminem");
        System.out.println("2.2-pac");
        System.out.println("3.Three Muskeeteers");
        System.out.println("4.Exit");
        int s = scanner.nextInt();
        switch(s){
            case 1:
                System.out.println("I love eminem too.");
                break;
            case 2:
                System.out.println("2-pac the legend");
                break;
            case 3:
                System.out.println("My favourtie card is 3 muskeeteers.");
                break;
            case 4:
                break;
        }
    }
}
