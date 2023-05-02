package UF4.HerenciaSimple;

public class Estudiant extends Persona {

    private String curs;

    private String assignatures;

    private String escola;

    private int notes;

    public Estudiant(String sDni, String sNom, int iEdat) {
        super(sDni, sNom, iEdat);
    }

    public String getCurs() {
        return curs;
    }

    public void setCurs(String curs) {
        this.curs = curs;
    }

    public String getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(String assignatures) {
        this.assignatures = assignatures;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public int getNotes() {
        return notes;
    }

    public void setNotes(int notes) {
        this.notes = notes;
    }


}
