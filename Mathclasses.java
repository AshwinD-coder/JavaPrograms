import java.util.Scanner;
public class Mathclasses {
    public static void main(String[] args) {
        double x = 3.14;
        double y = -10;
        double z = Math.max(x,y);
        System.out.println("Max:"+z);
        z = Math.min(x,y);
        System.out.println("Min:"+z);
        z = Math.abs(z);
        System.out.println("Abs value of min :"+z);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x:");
        x = scanner.nextDouble();

        System.out.println("Enter the value of y:");
        y = scanner.nextDouble();

        z = Math.sqrt(Math.pow(x,2)+Math.pow(y,2));
        System.out.println("The value of hypotenuse is :"+z);
    }
}
