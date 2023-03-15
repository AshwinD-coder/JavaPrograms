package Super;

public class Hero extends Person{
    String power;
    Hero(String name , int age , String Power){
        super(name,age);
        this.power = Power;
    }
}
