package ArrayofObjects;

public class main {
    public static void main(String[] args) {
//        String [] name = {"Ashwin","Abiral" , "Sajan" , "Shardul ","Maulik"};
//          String[] name = new String[5];
//          name[0]= "Ashwin";
//        for (int i = 0; i <name.length ; i++) {
//            System.out.println(name[i]);
//
//        }

        //Array of Objects;
//        One way of declaring array of objects.
//        Food[] refrigerator = new Food[3];
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("KFC");

        Food[] refrigerator = {food1,food2,food3};
//        refrigerator[0] = food1;
//        refrigerator[1] = food2;
//        refrigerator[2] = food3;

        for (int i = 0; i <refrigerator.length ; i++) {
            System.out.println(refrigerator[i].name);
                    }
        food1.eat();
        }
}
