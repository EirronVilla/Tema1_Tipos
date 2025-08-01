package cr.ac.una.Entidades;

public abstract class Persona {
    // Propiedades (atributos)
    protected String nombre;
    protected int edad;
    private static int cantidadDePersonas;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidadDePersonas++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static int getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    // Método (comportamiento)
    public void saludar() {
        System.out.println("Hola, mi nombre es " + nombre + " y tengo " + edad + " años.");
    }

    // Metodos abstractos NO tienen implementacion en la clase padre

    public abstract String condicion();
}
