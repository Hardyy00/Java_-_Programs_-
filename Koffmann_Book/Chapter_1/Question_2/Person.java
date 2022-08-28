package question2.com.hardik;

public abstract class Person {
    private final String name;
    private final int age;
    private final String gender;
    private String phoneNumber;
    private final PersonType personType;

    public enum PersonType{
        STUDENT,
        EMPLOYEE
    }

    public Person(String name  , int age, String gender , PersonType personType){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.personType = personType;
        this.phoneNumber = "...........";
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Person Type - " + personType
                + "\nName - " + name
                + "\nGender - " + gender
                + "\nAge - " + age
                + "\nPhone Number - " + phoneNumber;
    }
}
