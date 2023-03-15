package Encapsulation;

public class Myinfo {
    private String name;
    private String Degree;
    private String Program;
    private String College;
    private int CollegeRollNo;
    private String RegistrationNumber;

    public void setName(String name) {
        this.name = name;
    }

    public void setDegree(String degree) {
        Degree = degree;
    }

    public void setProgram(String program) {
        Program = program;
    }

    public void setCollege(String college) {
        College = college;
    }

    public void setCollegeRollNo(int collegeRollNo) {
        CollegeRollNo = collegeRollNo;
    }

    public void setRegistrationNumber(String registrationNumber) {
        RegistrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public String getDegree() {
        return Degree;
    }

    public String getProgram() {
        return Program;
    }

    public String getCollege() {
        return College;
    }

    public int getCollegeRollNo() {
        return CollegeRollNo;
    }

    public String getRegistrationNumber() {
        return RegistrationNumber;
    }
}
