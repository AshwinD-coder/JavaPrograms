public class Wrapperclass {
    public static void main(String[] args) {
        Integer x = 69;
        Character s = '@';
        Boolean b = true;
        Double d = 3.14;
        String S = "3.12";
        d = Double.parseDouble(S);
        System.out.println(d);
        if(b.equals(true)){
            System.out.println("b is true");
        }
        if(s.compareTo('@')==0){
            System.out.println("Comparison provide same data");
        }
        int prim =  x.intValue();
        System.out.println(prim);
        String  prim1 = x.toString();
        System.out.println(prim1.contains("8"));
    }
}
