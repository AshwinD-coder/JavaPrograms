package Interfaces;

public class Main {
    public static void main(String[] args) {
        Fish fish = new Fish();
        fish.hunt();
        Hawk hawk = new Hawk();
        hawk.hunt();
        fish.flee();
        Rabbit bunny = new Rabbit();
        bunny.flee();
    }
}
