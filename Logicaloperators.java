import java.util.Scanner;
import java.util.Random;
public class Logicaloperators {
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int user_score, computer_score;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String key;
        System.out.println("Press 1 to roll");
        int input = scanner.nextInt();
        scanner.nextLine();
        do {
            if (input == 1) {
                user_score = random.nextInt(10) + 1;
                computer_score = random.nextInt(10) + 1;
                if (user_score > computer_score) {
                    System.out.println("You win the round.(Your score: "+user_score+" & Computer score: "+computer_score+")");
                } else if (user_score == computer_score) {
                    System.out.println("Round Draw.Both scored : "+user_score);
                } else {
                    System.out.println("Computer won the round.(Your score: "+user_score+" & Computer score:"+computer_score+")");
                }
            } else {
                System.out.println("Invalid number pressed.Press 1 to play.");
            }
            System.out.println("Press 1 to roll again.You are playing the game.Press q or Q to quit.");
            key = scanner.nextLine();
            if (key.equals("q") || key.equals("Q")) {
                System.out.println("Game quit");
            }
            else if(key.equals("1")){
                input = 1;
                clearScreen();

            }
        }
        while (!key.equals("q") || !key.equals("Q") && key.equals("1"));
        System.out.println("gg");
    }
}
