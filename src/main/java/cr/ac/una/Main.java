package cr.ac.una;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Persona p = new Persona("Juan", 25);
        Persona s = new Persona("Maria", 30);

        System.out.println("La cantidad de personas es: " + Persona.getCantidadDePersonas());
    }
}

