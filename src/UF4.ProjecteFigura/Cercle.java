package UF4.ProjecteFigura;

public class Cercle extends Figura {

    private double radi;

    public Cercle( double radi) {
        this.radi = radi;
        setFigura("Cercle");
    }

    public Cercle(){
        setFigura("Cercle");
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi(double radi) {
        this.radi = radi;
    }

    public double calcularArea()
    {
        double area = Math.pow(radi, 2)*Math.PI;
        return area;
    }
	
}