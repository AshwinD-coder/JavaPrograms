public class Overloadedmethods {            //Overloaded methods - methods that share same name but
                                            // different parameters.(Method signature = Method name + Method Parameters.)
    public static void main(String[] args) {
        System.out.println(add(12,10));
        System.out.println(add(12,10,10));
        System.out.println(add(12,10,10,5));



    }
    static int add(int x,int y){

        return x+y;

    }
    static int add(int x,int y,int z){
        return x+y+z;
    }
    static int add(int x,int y,int z,int o){
        return x+y+z+o;
    }

}
