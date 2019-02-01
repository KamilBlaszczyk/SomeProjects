package hospital_dziedziczenie;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Patient extends Person{

    private int number;
    private String sick;
    private String lek;

    public Patient(String name, String surname, int age){
        super(name, surname, age);
    }

//    public Patient(String name, String surname, int age, String sick){
//        super(name, surname,age);
//
//    }

    public int getNumber() {
        return number;
    }

    public String getSick() {
        return sick;
    }

    public String getLek() {
        return lek;
    }

    public void setSick(String sick) {
        this.sick = sick;
    }

    public void setLek(String lek) {
        this.lek = lek;
    }

}
