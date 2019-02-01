package hospital_dziedziczenie;

public class Nurse extends Person {

    private int extra;

    public Nurse(String name, String surname, int age, int salary, int extra){
        super(name, surname, age, salary);
        this.extra = extra;
    }

    public int getExtra() {
        return extra;
    }
}


