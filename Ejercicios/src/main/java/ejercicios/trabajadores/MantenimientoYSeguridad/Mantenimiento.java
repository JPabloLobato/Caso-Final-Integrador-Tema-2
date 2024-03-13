package ejercicios.trabajadores.MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Mantenimiento {
    private List<Tarea> tareas;

    public Mantenimiento() {
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    public void completarTarea(String descripcion) {
        for (Tarea tarea : tareas) {
            if (tarea.getDescripcion().equals(descripcion)) {
                tarea.setEstado("Completado");
                break;
            }
        }
    }

    public void mostrarTareas() {
        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}
