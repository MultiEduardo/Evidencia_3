package Menu;

public class Cita {
    private int idCita;
    private String fecha;
    private String hora;

    public Cita(int idCita, String fecha, String hora) {
        this.idCita = idCita;
        this.fecha = fecha;
        this.hora = hora;
    }


    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

}
