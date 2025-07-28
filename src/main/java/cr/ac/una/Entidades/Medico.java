package cr.ac.una.Entidades;

public class Medico extends Persona {
    String especialidad;

    public Medico(String nombre, int edad, String especialidad) {
        super(nombre, edad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String condicion() {
        if(this.edad > 65){
            return "Pensionado";
        }

        else {
            return "Activo";
        }
    }
}
