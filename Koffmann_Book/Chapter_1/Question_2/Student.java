package question2.com.hardik;

public class Student extends Person{

    private double gpa;
    private String major;
    private int graduationYear;

    public Student(String name, int age, String gender) {
        super(name, age, gender , PersonType.STUDENT);
        this.gpa = -1.0d;
        this.major = "..........";
        this.graduationYear = -1;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString(){
        return super.toString()
                + "\nGPA - " + gpa
                + "\nMajor - " + major
                + "\nGraduation Year - " + graduationYear;
    }
}
