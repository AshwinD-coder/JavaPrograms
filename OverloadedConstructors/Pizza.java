package OverloadedConstructors;

public class Pizza {
    String bread;
    String sauce;
    String toppings;
    String Cheese ;

    public Pizza(String bread, String sauce, String toppings, String cheese) {
        this.bread = bread;
        this.sauce = sauce;
        this.toppings = toppings;
        this.Cheese = cheese;
    }
    void displayPizzaType(){
        System.out.println("Bread:"+bread);
        System.out.println("Sauce:"+sauce);
        System.out.println("Toppings:"+toppings);
        System.out.println("Cheese:"+Cheese);

    }

    public Pizza(String bread, String cheese) {
        this.bread = bread;
        Cheese = cheese;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings='" + toppings + '\'' +
                ", Cheese='" + Cheese + '\'' +
                '}';
    }
}
