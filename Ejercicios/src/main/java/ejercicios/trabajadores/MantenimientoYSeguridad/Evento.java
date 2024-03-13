package ejercicios.trabajadores.MantenimientoYSeguridad;

public class Evento {
    private String descripcion;
    private String ubicacion;
    private String hora;

    public Evento(String descripcion, String ubicacion, String hora) {
        this.descripcion = descripcion;
        this.ubicacion = ubicacion;
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "descripcion='" + descripcion + '\'' +
                ", ubicacion='" + ubicacion + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}