package figures;

public class Circle implements Figure{

    double promien;

    Circle(double promien){
        this.promien=promien;
    }

    Circle(){
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