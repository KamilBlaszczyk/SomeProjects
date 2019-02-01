package hospital_dziedziczenie;

class Doctor extends Person{

    private String specialization;
    private String car;
    private int bonus;

    public Doctor(String name, String surname, int age, int salary, String specialization, String car, int bonus){
        super(name, surname, age, salary);
        this.specialization = specialization;
        this.car = car;
        this.bonus = bonus;
    }

    public Doctor(String name, String surname, int age, int salary){
        super(name, surname, age, salary);
    }

    public String getSpecialization() {
        return specialization;
    }

    public String getCar() {
        return car;
    }

    public int getBonus() {
        return bonus;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public int DoctorCounts(){
        return 6*6;
    }

}
