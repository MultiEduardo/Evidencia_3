package Menu;

public class Paciente extends Persona {
    private String descProb;

    public Paciente(String name, String descProb) {
        super(name);
        this.descProb = descProb;
    }

    public String getDescProb() {
        return descProb;
    }

    public void setDescProb(String descProb) {
        this.descProb = descProb;
    }
}
