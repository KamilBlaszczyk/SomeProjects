package figures;

import figures.Figure;

public class Triangle implements Figure {

    double a;
    double h;

    Triangle(){
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
