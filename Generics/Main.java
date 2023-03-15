package Generics;


import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        Integer[] integersArray = {1,2,3,4,5,6,7,8,9};
        Double[] doublesArray = {1.23,24.122,425.2552,1212.22};
        Character[] charactersArray = {'a','e','i','o','u'};
        Boolean[] boolsArray = {true,false,false,true};
        displayArray(integersArray);
        displayArray(doublesArray);
        displayArray(charactersArray);
        displayArray(boolsArray);

    }
    public static <T> void displayArray(T[] x){
       for(T i :x){
           System.out.print(i+" ");

       }
        System.out.println();

    }
}
