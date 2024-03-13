package ejercicios.trabajadores.MantenimientoYSeguridad;

import java.util.ArrayList;
import java.util.List;

public class Seguridad {
    private List<Evento> eventos;

    public Seguridad() {
        this.eventos = new ArrayList<>();
    }

    public void agregarEvento(Evento evento) {
        eventos.add(evento);
    }

    public void mostrarEventos() {
        for (Evento evento : eventos) {
            System.out.println(evento);
        }
    }
}