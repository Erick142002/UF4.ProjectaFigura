package UF4.ProjecteFigura;

import UF4.ProjecteFigura.Figura;

public class Triangle extends Figura {

    private double b;
    private double a;

    public Triangle(double b, double a) {
        this.b = b;
        this.a = a;
        setFigura("Triangle");
    }
    public Triangle(){
        setFigura("Triangle");
    }

    public double getB() {
        return b;
    }

    public double getA() {
        return a;
    }
    public void setB(double b) {
        this.b = b;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double calcularArea()
    {

        double area = (b * a) / 2;
        return area;
    }


}