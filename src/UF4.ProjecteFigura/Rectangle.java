package UF4.ProjecteFigura;

public class Rectangle extends Figura {

    private double c1;
    private double c2;

    public Rectangle(double c1, double c2) {
        this.c1 = c1;
        this.c2 = c2;
        setFigura("Rectangle");
    }
    public Rectangle(){
        setFigura("Rectangle");
    }

    public double getC1() {
        return c1;
    }

    public double getC2() {
        return c2;
    }

    public void setC1(double c1) {
        this.c1 = c1;
    }
    public void setC2(double c2) {
        this.c2 = c2;
    }
    public double calcularArea()
    {
        double area = c1 * c2;
        return area;
    }
}