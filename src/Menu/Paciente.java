package Menu;

public class Paciente extends Persona {
    private String descProb;

    public Paciente(String name, int id, String descProb) {
        super(name, id);
        this.descProb = descProb;
    }

    public String getDescProb() {
        return descProb;
    }

    public void setDescProb(String descProb) {
        this.descProb = descProb;
    }
}
