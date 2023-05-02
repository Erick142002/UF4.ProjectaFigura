package UF4.ProjecteFigura;

import UF4.ProjecteFigura.Figura;

public class Quadrat extends Figura {

    private double r;

    public Quadrat( double r) {
        this.r = r;
        setFigura("Quadrat");
    }

    public Quadrat(){
        setFigura("Quadrat");
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }


    public double calcularArea() {
        double area = Math.pow(r, 2);
        return area;
    }
}