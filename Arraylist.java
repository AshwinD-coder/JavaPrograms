import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> food = new ArrayList<String>(); // initialization of array list
        ArrayList<String> favourite_food = new ArrayList<String>(); // initialization of array list

        //add items into array list.
        food.add("Pizza");
        food.add("Hamburger");
        food.add("Hot Dog");

        food.set(1,"Burger");
        food.remove(2);
        food.clear();
        if(food.isEmpty()){
            System.out.println("Food list is empty");
        }
        for(int i=0 ; i<food.size() ; i++){
            System.out.println(food.get(i));
        }
    }
}
