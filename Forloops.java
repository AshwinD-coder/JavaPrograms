import java.util.Scanner;
public class Forloops {
    public static void main(String[] args){
       for(int i = 10 ; i>0 ;){
           System.out.println(i);
           i-=2;
       }
        System.out.println("Happy new year");

       //Nested loops
        Scanner scanner = new Scanner(System.in);
        int rows , columns ;
        String symbol = "";
        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();

        scanner.nextLine();

        System.out.println("Enter the number of columns: ");
        columns = scanner.nextInt();


        System.out.println("Enter the symbol to use: ");
        symbol = scanner.next();

        for(int i = 0 ; i<rows ;i++){
            System.out.println();
            for(int j = columns ; j>0 ;j--){
                System.out.print(symbol);
            }
        }

    }
}
