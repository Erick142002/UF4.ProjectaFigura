package UF4.HerenciaSimple;

public class Persona {
    private int id;

    private String edat;

    private String nom;

    private String cognom;

    private String adreça;

    public Persona(String sDni, String sNom, int iEdat) {

    }

    public Persona(String nNom) {
    }

    public Persona(String nom, String correu, int telefon, int edad) {

    }

    public Persona(String sNom2, String cCorreu, int iTelefon, String cCurs, int eEdat) {

    }

    public Persona(String nNom2, String aAdreça2) {

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEdat() {
        return edat;
    }
    public void setEdat(String edat) {
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public String getAdreça() {
        return adreça;
    }
    public void setAdreça(String adreça) {
        this.adreça = adreça;
    }



}
