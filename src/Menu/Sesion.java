package Menu;

import DB.Database;

public class Sesion {
    private String user;
    private String password;

    public Sesion(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean iniciarSesion(Database db){
        if(db.validarSesion(this)){
            System.out.println("Sesión iniciada");
            return true;
        } else {
            System.err.println("Usuario o contraseña incorrecto");
            return false;
        }
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }



}
