public class MethodsStringClass {
    public static void main(String[] args) {
        String name = "Ashwin";

        //LowerCase method
        String lower = name.toLowerCase();
        System.out.println(lower);

        //UpperCase method
        String upper = name.toUpperCase();
        System.out.println(upper);

        //isEmpty method
        boolean result = name.isEmpty();
        System.out.println(result);

        //replace method
        System.out.println(name.replace("h","s"));

        //equalsIgnoreCase method ,,equals method
        boolean equals = name.equalsIgnoreCase(lower);
        System.out.println(equals);

        //charat method -gives character at certain index
        for(int i=0 ;i<name.length() ;i++){
            System.out.print(name.charAt(i));
        }

        //indexof method -gives index of character in a String.
        System.out.println();
        System.out.println(name.indexOf('A'));

        //Split method
        String[] cut_name = name.split("win");
        for(int i=0 ; i< cut_name.length ; i++) {
            System.out.println(cut_name[i]);
        }

        //Trim method
        name = "       Hello World            ";
        String trim = name.trim();
        System.out.println(trim);


    }
        }



