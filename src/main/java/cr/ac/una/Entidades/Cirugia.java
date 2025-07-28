package cr.ac.una.Entidades;

import java.util.Date;

public class Cirugia implements ITratamiento{
    private String tipoCirugia;
    private Date fechaDeAplicacion;

    public Cirugia(String tipoCirugia) {
        this.tipoCirugia = tipoCirugia;
    }

    @Override
    public void aplicarTratamiento(String paciente) {
        System.out.println("Aplicando tratamiento... paciente: " + paciente);
        fechaDeAplicacion = new Date();
    }

    @Override
    public String obtenerDescripcion() {
        String descripcion = "Obteniendo informacion de la Cirugia. \n";
        descripcion += "Cirugia aplicada el dia: " + fechaDeAplicacion + "\n";
        descripcion += "Tipo de cirugia: " + tipoCirugia + "\n";
        return descripcion;
    }

    // Getters and setters
    public String getTipoCirugia() {
        return tipoCirugia;
    }

    public void setTipoCirugia(String tipoCirugia) {
        this.tipoCirugia = tipoCirugia;
    }

    public Date getFechaDeAplicacion() {
        return fechaDeAplicacion;
    }

    public void setFechaDeAplicacion(Date fechaDeAplicacion) {
        this.fechaDeAplicacion = fechaDeAplicacion;
    }
}
