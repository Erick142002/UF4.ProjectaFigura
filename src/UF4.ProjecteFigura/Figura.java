package UF4.ProjecteFigura;

public class Figura {

    public String figura;
    public static int id;

    public Figura() {id++;}

        public String getFigura() { return figura; }

        public void setFigura(String Figura) { this.figura = Figura;}

        public int getId() {
        return id;
        }


    public double calcularArea()
    {
        return 0;
    }

    public void setId(int id) { this.id = id;}

        public void ImprimirDades(){
        calcularArea();
        System.out.println(" La figura amb id " + getId() + "és un " + getFigura());
        System.out.println(" L'àrea del " + getFigura() + " és " + calcularArea());
        System.out.println("...............");

        }

}



