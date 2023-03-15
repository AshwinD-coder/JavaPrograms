package Encapsulation;

public class Main {
    public static void main(String[] args) {
        Myinfo info = new Myinfo();
        info.setName("Ashwin Dhougoda");
        info.setCollege("Khwopa Engineering College");
        info.setDegree("Bachelors");
        info.setProgram("Computer");
        info.setCollegeRollNo(750308);
        info.setRegistrationNumber("035-3-2-02803-2018");

        System.out.println("My name is: "+info.getName());
        System.out.println("My college is: "+info.getCollege());
        System.out.println("My degree is: "+info.getDegree());
        System.out.println("My program is: "+info.getProgram());
        System.out.println("My college roll no. is : "+info.getCollegeRollNo());
        System.out.println("My registration number is: "+info.getRegistrationNumber());


    }
}
