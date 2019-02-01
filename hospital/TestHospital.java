package hospital_dziedziczenie;

import java.util.LinkedList;
import java.util.List;

import java.util.Scanner;

public class TestHospital {

    public static void main(String args[]){

        Scanner load = new Scanner(System.in);

        int licznik = 0;

        while(licznik==0) {
            System.out.println("*** Witaj w Szpitalu *** \n");
            System.out.println("Zarządzanie lekarzami kliknij 1: ");
            System.out.println("Zarządzanie pacjentami kliknij 2: ");

            System.out.println("By wyjsc kliknij 9");

            int chose = load.nextInt();
            switch (chose) {
                case 1:
                    Heal.createDoctor();
                    break;
                case 2:
                    Heal.createPatient();
                    break;
                case 3:
                    break;
                case 9:
                    licznik = 1;
                    break;

            }
        }
    }

}
