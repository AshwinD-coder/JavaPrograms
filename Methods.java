public class Methods {
    public static void main(String[] args) {
        String name = "Bro";
        int age = 22;
        hello(name,age);
        System.out.println("The sum is : "+add(12,56));

    }
    static void hello(String title,int age){
        System.out.println("Hello "+title+" , You are "+age+" years old.");
    }
    static int add(int x , int y){

        return x+y;
    }
}
