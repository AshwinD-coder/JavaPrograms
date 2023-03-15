package OverloadedConstructors;

public class main {
    public static void main(String[] args) {
        Pizza myPizza = new Pizza("Thicc crust","Ketchup","Tomato","Mozarella");
        Pizza yourPizza = new Pizza ("Thicc crust","Mozarella");
        System.out.println("Heres the details of my pizza:");
        System.out.println(myPizza.toString());
        System.out.println("Heres the details of your pizza:");
        System.out.println(yourPizza.toString());
    }
}
