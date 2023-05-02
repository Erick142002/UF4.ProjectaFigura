package UF4.ProjecteFigura;

import UF4.ProjecteFigura.Figura;

public class Pararllelogram extends Figura {

    private double b;

    private double h;

    public Pararllelogram( double b, double h) {
        this.b = b;
        this.h = h;
        setFigura("Paral·lelogram");
    }


    public Pararllelogram(){
        setFigura("Paral·lelogram");
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double calcularArea()
    {
        double area = b * h;
        return area;
    }
}