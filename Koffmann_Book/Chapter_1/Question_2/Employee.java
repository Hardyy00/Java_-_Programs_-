package question2.com.hardik;

public class Employee extends Person{

    private String jobDepartment;
    private String jobName;
    private  int yearOfHire;
    private EmployeeType employeeType;

    public enum EmployeeType{
        HOURLY_EMPLOYEE,
        SALARIED_EMPLOYEE,
        UNEMPLOYED
    }

    public Employee(String name, int age, String gender) {
        super(name, age, gender, PersonType.EMPLOYEE);
        this.jobDepartment = "..........";
        this.jobName = ".........";
        this.employeeType = EmployeeType.UNEMPLOYED;
    }

    public void setJobDepartment(String jobDepartment) {
        this.jobDepartment = jobDepartment;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public void setYearOfHire(int yearOfHire) {
        this.yearOfHire = yearOfHire;
    }

    public void setEmployeeType(EmployeeType employeeType) {
        this.employeeType = employeeType;
    }

    @Override
    public String toString(){
        return super.toString()
                + "\nEmployee Type - " + employeeType
                + "\nJob Department - " + jobDepartment
                + "\nJob Name - " + jobName
                + "\nYear of Hiring - " + yearOfHire;
    }
}
