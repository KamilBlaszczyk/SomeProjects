package interfejs_figury;

import java.util.Scanner;

public class TestFigure {

    public static void main(String[] args) {

        Scanner load = new Scanner(System.in);

        for(int i = 0;  i<(i+1); i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println();
            System.out.println("*** FIGURY***");
            System.out.println();
            System.out.println("*** Menu wyboru***");
            System.out.println("1 - prostokat");
            System.out.println("2 - kolo");
            System.out.println("3 - trojkat");
            System.out.println("4 - trapez");
            System.out.println("5 - Zakończ działanie programu");

            int wybor = scanner.nextInt();

            switch (wybor) {
                case 1:
                    Figura obiekt1 = new Prostokat();
                    System.out.println("Podaj pierwszy bok");
                    ((Prostokat) obiekt1).a = load.nextInt();
                    System.out.println("Podaj drugi bok");
                    ((Prostokat) obiekt1).b = load.nextInt();
                    System.out.println("Pole prostokąta to:" + obiekt1.obliczPole() + "\n" + "Obwód prostokąta to:" + obiekt1.obliczObw());
                    break;
                case 2:
                    Figura obiekt2 = new Kolo();
                    System.out.println("Podaj promień okręgu");
                    ((Kolo) obiekt2).promien = load.nextInt();
                    System.out.println("Pole koła to:" + obiekt2.obliczPole() + "\n" + "Obwód koła to:" + obiekt2.obliczObw());
                    break;
                case 3:
                    Figura obiekt3 = new Trojkat();
                    System.out.println("Podaj a trojkata");
                    ((Trojkat) obiekt3).a = load.nextInt();
                    System.out.println("Podaj h trojkata");
                    ((Trojkat) obiekt3).h = load.nextInt();
                    System.out.println("Pole trojkata to:" + obiekt3.obliczPole() + "\n" + "Obwód trojkata rownobocznego:" + obiekt3.obliczObw());
                    break;
                case 4:
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }




        //TEST wywołanie konstruktora paramterowego klasy interfejs_figury.Kolo;

        //interfejs_figury.Figura defaultCircle = new interfejs_figury.Kolo(10);
        //interfejs_figury.Figura defaultRectangle = new interfejs_figury.Prostokat(50, 2);

        //System.out.println("Pole domyślnego kola to:" + defaultCircle.obliczPole());
        //System.out.println("Pole domyślnego prostokąta to:" + defaultRectangle.obliczPole());

    }
}