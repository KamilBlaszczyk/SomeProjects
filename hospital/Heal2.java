package hospital_dziedziczenie;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Heal {

    public static void createDoctor() {

        Scanner load = new Scanner(System.in);

        List<Doctor> list = new LinkedList<>();

        int licznik = 0;

        while(licznik==0){
            System.out.println("*** Witaj w menu zarządzania lekarzami *** \n");
            System.out.println("By dodać lekarza kliknij 1");
            System.out.println("Podgląd listy lekarzy 2");
            System.out.println(" Dodaj lekarzowi auto");
            System.out.println(" Dodaj lekarzowi specjalizacje");
            System.out.println(" Dodaj lekarzowi premię");
            System.out.println(" Zwolnij lekarza ");
            System.out.println("By wrócić do menu głównego nacisnij 9");

            int chose = load.nextInt();
            load.nextLine();  //wpisane tylko po to by uniknac problemow z Scannerem

            switch(chose){
                case 1:
                    System.out.println("Podaj imie: ");
                    String imie = load.nextLine();

                    System.out.println("Podaj nazwisko: ");
                    String nazwisko = load.nextLine();

                    System.out.println("Podaj wiek: ");
                    int wiek = load.nextInt();

                    System.out.println("Podaj wynagrodzenie: ");
                    int wynagrodzenie = load.nextInt();

                    list.add(new Doctor(imie, nazwisko, wiek, wynagrodzenie));
                    break;
                case 2:
                    int i=0;
                    for(Doctor x:list){
                        System.out.println(i +" "+ x.getName() +" "+ x.getSurname() +" "+ x.getAge() +" "+ x.getSalary() +" "+ x.getCar() +" "+ x.getSpecialization() +" "+ x.getBonus());
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("Któremu lekarzowi dodać auto?");
                    int id = load.nextInt(); load.nextLine();

                    System.out.println("Podaj nazwę samochodu");
                    String auto = load.nextLine();
                    list.get(id).setCar(auto);
                    break;
                case 4:
                    System.out.println("Któremu lekarzowi dodać specjalizację?");
                    id = load.nextInt(); load.nextLine();

                    System.out.println("Podaj nazwę specjalizacji");
                    String spec = load.nextLine();
                    list.get(id).setSpecialization(spec);
                    break;
                case 5:
                    System.out.println("Któremu lekarzowi dodać premie?");
                    id = load.nextInt(); load.nextLine();

                    System.out.println("Podaj kwotę premi");
                    int premia = load.nextInt();
                    list.get(id).setBonus(premia);
                    break;
                case 6:
                    System.out.println("Którego lekarza zwolnić w trybie natychmiastowym?");
                    id = load.nextInt(); load.nextLine();
                    list.remove(id);
                    break;
                case 9:
                    licznik=1;
                    break;
            }
        }
    }

    public static void createPatient() {

        Scanner load = new Scanner(System.in);

        List<Patient> lista = new LinkedList<Patient>();

        int licznik = 0;

        while (licznik == 0) {
            System.out.println("*** Witaj w menu zarządzania pacjentami *** \n");
            System.out.println("By stworzyc pacjenta kliknij 1: ");
            System.out.println("By zobaczyć listę pacjętów kliknij 2: ");
            System.out.println("Dodaj chorobe do gościa 3: ");
            System.out.println("By wrócić do menu głównego nacisnij 9");

            int chose = load.nextInt();
            load.nextLine();  //wpisane tylko po to by uniknac problemow z Scannerem
            switch (chose) {
                case 1:
                    System.out.println("Podaj imie: ");
                    String imie = load.nextLine();

                    System.out.println("Podaj nazwisko: ");
                    String nazwisko = load.nextLine();

                    System.out.println("Podaj wiek: ");
                    int wiek = load.nextInt();

                    lista.add(new Patient(imie, nazwisko, wiek));
                    break;
                case 2:
                    int i = 0;
                    for (Patient x : lista) {
                        System.out.println(i + x.getName() + " " + x.getSurname() + " " + x.getAge() + x.getSick());
                        i++;
                    }
                    break;
                case 3:
                    System.out.println("Podaj id gościa: ");
                    int id = load.nextInt(); load.nextLine();

                    System.out.println("Podaj chorobe ahahahahaha: ");
                    String choroba = load.nextLine();
                    lista.get(id).setSick(choroba);
                    break;
                case 9:
                    licznik = 1;
                    break;

            }
        }

    }
}
