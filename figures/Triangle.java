package interfejs_figury;

public class Trojkat implements Figura {

    double a;
    double h;

    Trojkat(){
        a=0;
        h=0;
    }

    @Override
    public double obliczPole() {
        return (a*h)/2;
    }

    public double obliczObw() {
        return 3*a;
    }

}
