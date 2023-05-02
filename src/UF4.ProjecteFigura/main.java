package UF4.ProjecteFigura;

public class main {
    public static void main(String[] args) {

        Triangle T1 = new Triangle(32, 56);
        T1.ImprimirDades();

        Quadrat Q1 =  new Quadrat(32);
        Q1.ImprimirDades();

        Rectangle R1 = new Rectangle(20, 25);
        R1.ImprimirDades();

        Trapezi TZ = new Trapezi(40, 34);
        TZ.ImprimirDades();

        Rombe RO = new Rombe(14, 32);
        RO.ImprimirDades();

        Pararllelogram PR = new Pararllelogram(75, 39);
        PR.ImprimirDades();

        Cercle CE = new Cercle(32);
        CE.ImprimirDades();
    }
}
