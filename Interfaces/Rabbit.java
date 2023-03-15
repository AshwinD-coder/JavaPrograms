package Interfaces;

public class Rabbit implements Prey{
    @Override
    public void flee() {
        System.out.println("The bunny is hopping and fleeing from its predator.");
    }
}