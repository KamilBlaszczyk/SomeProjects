package figures;

public class Rectangle implements Figure{

    double a;
    double b;

    Rectangle(double a,double b){
        this.a=a; this.b=b;
    }

    Rectangle(){
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
