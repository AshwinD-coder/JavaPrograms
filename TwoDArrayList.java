import java.lang.reflect.Array;
import java.util.ArrayList;

public class TwoDArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> groceryList = new ArrayList<>();

        ArrayList<String> foodList = new ArrayList<>();
        foodList.add("Noodles");
        foodList.add("Chicken Momo");
        foodList.add("Pizza");

        ArrayList<String> produceList = new ArrayList<>();
        produceList.add("Carrot");
        produceList.add("Cucumber");
        produceList.add("Spinach");

        ArrayList<String> drinkList = new ArrayList<>();
        drinkList.add("Coke");
        drinkList.add("Virgin Mojito");
        drinkList.add("Somersby");

        groceryList.add(foodList);
        groceryList.add(produceList);
        groceryList.add(drinkList);

//        System.out.println(groceryList);

//        for(int i=0 ; i<groceryList.size() ; i++){
//            System.out.println();
//            for (int j=0 ; j<groceryList.size() ; j++){
//                System.out.print(groceryList.get(i).get(j)+", ");
//            }
//        }

        //For each loop ----
        for (ArrayList<String> i : groceryList){
            System.out.println();
            for (String j : i){
                System.out.print(j+" , ");
            }
            }
        }

    }

