package UF4.ProjecteFigura;

import UF4.ProjecteFigura.Figura;

public class Rombe extends Figura {
    private double dM;

    private double dm;

    public Rombe( double dM, double dm) {
        this.dM = dM;
        this.dm = dm;
        setFigura("Rombe");
    }

    public Rombe(){
        setFigura("Rombe");
    }

    public double getdM() {
        return dM;
    }

    public double getDm() {
        return dm;
    }

    public void setdM(double dM) {
        this.dM = dM;
    }

    public void setDm(double dm) {
        this.dm = dm;
    }


    public double calcularArea() {
        double area = (dM * dm) / 2;
        return area;
    }
}