import java.util.Random;

public class DiceRoller {
    Random random = new Random();

    public DiceRoller() {
        roll();
    }
    void roll(){
        int x = random.nextInt(6)+1;
        System.out.println(x);
    }
}
