package interfejs_figury;

public class Prostokat implements Figura{

    double a;
    double b;

    Prostokat(double a,double b){
        this.a=a; this.b=b;
    }

    Prostokat(){
        a=0;
        b=0;
    }

    @Override
    public double obliczPole() {
        return a*b;
    }

    public double obliczObw() {
        return (a+b)*2;
    }

}
