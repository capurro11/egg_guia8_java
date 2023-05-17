package Entidad;

import java.util.Date;

public class Persona {
    
    private String Nombre;
    private Date Nacimiento;

    public Persona(String Nombre, Date Nacimiento) {
        this.Nombre = Nombre;
        this.Nacimiento = Nacimiento;
    }

    public Persona() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre=" + Nombre + ", Nacimiento=" + Nacimiento + '}';
    }
}
