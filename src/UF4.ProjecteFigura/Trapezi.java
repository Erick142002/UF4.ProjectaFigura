package UF4.ProjecteFigura;

import UF4.ProjecteFigura.Figura;

public class Trapezi extends Figura {

    private double a;
    private double b;
    private double h;

    public Trapezi( double a, double b){
        this.a = a;
        this.b = b;
        setFigura("Trapezi");
    }
    public Trapezi(double h){
        this.h = h;
    }

    public Trapezi(){
        setFigura("Trapezi");
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getH() {
        return h;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setH(double h) {
        this.h = h;
    }
    public double calcularArea()
    {
        double area = ((a * b) * h) / 2;
        return area;
    }

}