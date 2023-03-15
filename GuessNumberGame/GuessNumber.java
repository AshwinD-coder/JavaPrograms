package GuessNumberGame;

public class GuessNumber {
    Player p1;
    Player p2;
    Player p3;
    void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isright = false;
        boolean p2isright = false;
        boolean p3isright = false;
        System.out.println("I am thinking a number between 0-10..........");
        int randomnumber = (int) (Math.random() * 10);

        guessp1 = p1.guess();
        guessp2 = p2.guess();
        guessp3 = p3.guess();

        if(guessp1 ==randomnumber){
            p1isright = true;
            System.out.println("Player1 guessed it correct!");
        }
        else{
            System.out.println("Player1 guessed it wrong!");
        }

        if(guessp2 == randomnumber){
            p2isright = true;
            System.out.println("Player2 guessed it correct!");

        }
        else{
            System.out.println("Player2 guessed it wrong!");
        }

        if(guessp3 == randomnumber){
            p3isright = true;
            System.out.println("Player3 guessed it correct!");
        }
        else{
            System.out.println("Player3 guessed it wrong!");
        }

        if(!p1isright && !p2isright && !p3isright){
            System.out.println("Nobody guessed it right!!!");
        }
        System.out.println(randomnumber);
        System.out.println(guessp1);
        System.out.println(guessp2);
        System.out.println(guessp3);

    }
}
