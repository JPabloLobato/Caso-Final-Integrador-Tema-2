package ejercicios.trabajadores.MantenimientoYSeguridad;

public class Tarea {
    private String descripcion;
    private String fecha;
    private String estado;

    public Tarea(String descripcion, String fecha) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = "Pendiente";
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", fecha='" + fecha + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}