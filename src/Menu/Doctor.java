package Menu;

public class Doctor extends Persona {
    String especialidad;

    public Doctor(String name, String especialidad) {
        super(name);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }


}
