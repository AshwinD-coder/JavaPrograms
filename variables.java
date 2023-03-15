public class variables {
    public static void main(String[] args){
        boolean love;
        byte age;
        short postal_code;
        int street_no;
        long years;
        float pi;
        double pi_double;
        char special_symbol;
        love = true;
        age = 18;
        postal_code = 446;
        street_no = 44600;
        years = 492710284912819L;
        pi = 3.148126f;
        pi_double = 3.1471823645195123;
        special_symbol = '$';
        System.out.println(love);   //Boolean data type
        System.out.println(age);    //Byte data type
        System.out.println(postal_code);    //short data type
        System.out.println(street_no);      //int data type
        System.out.println(pi);         //float data type
        System.out.println(pi_double);  //double data type
        System.out.println(years);      //long data type
        System.out.println(special_symbol);     //char data type

        //Above data types are all primitive data types(8 -types)
        //String is a reference data type.
        String fullname="Ashwin Dhougoda";
        System.out.println("Good morning,"+fullname);
    }
}
