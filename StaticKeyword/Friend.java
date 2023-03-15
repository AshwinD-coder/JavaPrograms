package StaticKeyword;

public class Friend {
    String name;
    static int numberoffriends = 0;
    Friend(String name){
        this.name = name;
        numberoffriends++;
    }
    static String counter(){
        //Static method cannot access non static variables.
        return "Number of Friends : " + Friend.numberoffriends;
    }
}
