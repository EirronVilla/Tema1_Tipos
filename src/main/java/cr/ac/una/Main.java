package cr.ac.una;

import cr.ac.una.Entidades.Cirugia;
import cr.ac.una.Entidades.ITratamiento;
import cr.ac.una.Entidades.Medico;
import cr.ac.una.Entidades.Persona;


public class Main {
    public static void main(String[] args) {
        Persona p = new Medico("Juan", 25, "Pediatria");
        Persona s = new Medico("Maria", 30, "Geriatria");

        System.out.println("La cantidad de personas es: " + Persona.getCantidadDePersonas());

        ITratamiento t = new Cirugia("Cirugia menor");
        t.aplicarTratamiento("Paciente 1");

        System.out.println(t.obtenerDescripcion());
    }
}

