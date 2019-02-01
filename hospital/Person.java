package hospital_dziedziczenie;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int salary;

    public Person(String name, String surname, int age, int salary){
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
    }

    //Przeciążenie konstruktora
    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }
}


