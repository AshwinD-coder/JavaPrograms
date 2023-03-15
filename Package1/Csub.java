package Package1;
import Package2.*;

public class Csub extends C{
    public static void main(String[] args) {
        Csub csub = new Csub();
        System.out.println(csub.ProtectedMessage);
    }
}
