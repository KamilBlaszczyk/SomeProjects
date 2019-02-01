package interfejs_figury;

public class Kolo implements Figura{

    double promien;

    Kolo(double promien){
        this.promien=promien;
    }

    Kolo(){
        promien=0;
    }

    @Override
    public double obliczPole() {
        return promien*promien*(3.14);
    }

    public double obliczObw() {
        return (3.14)*(3.14)*promien;
    }

}