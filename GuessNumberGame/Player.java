package GuessNumberGame;

public class Player {
    int number ;
   int guess(){
        number = (int) (Math.random() * 10);
        return number;
    }
}
