package Menu;

public class Doctor extends Persona {
    String especialidad;

    public Doctor(String name, int id, String especialidad) {
        super(name, id);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
