package question2.com.hardik;

import java.util.ArrayList;

public class ApplicationClass {

    private static ArrayList<Person> persons = new ArrayList<>();

    public static void main(String[] args) {

        Student mandy = new Student("Mandy" , 21 , "Male");
        mandy.setGpa(3.2);
        mandy.setGraduationYear(2023);
        mandy.setMajor("Mechanical");

        persons.add(mandy);

        Student hardik = new Student("Hardik" , 19, "Male");
        hardik.setMajor("CSE");
        hardik.setGpa(4.89);
        hardik.setGraduationYear(2025);
        hardik.setPhoneNumber("7906372967");

        persons.add(hardik);

        Employee bell = new Employee("Stuart" , 32 , "Female");
        bell.setEmployeeType(Employee.EmployeeType.SALARIED_EMPLOYEE);
        bell.setJobDepartment("IT Department");
        bell.setJobName("SDE");
        bell.setPhoneNumber("8752091267");
        bell.setYearOfHire(2019);

        persons.add(bell);

        Employee mark = new Employee("Mark" , 34 , "Male");

        persons.add(mark);

        for(Person person : persons){

            System.out.println();
            System.out.println(person);

        }

    }
}
