import com.lausebas.eventmng.model.Evento;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ServicioEvento {

    private ArrayList<Evento> eventos;

    public ServicioEvento(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public void añadirEvento(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        for (Evento e : eventos) {
            if (e.getNombre().equalsIgnoreCase(evento.getNombre())) {
                throw new IllegalArgumentException("Ya existe un evento con el mismo nombre.");
            }
        }

        eventos.add(evento);
    }

    public Evento buscarEvento(String nombre, Class<?> tipoEvento) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre del evento no puede estar vacío o ser null.");
        }

        for (Evento evento : eventos) {
            if (evento.getNombre().equalsIgnoreCase(nombre) && tipoEvento.isInstance(evento)) {
                return evento;
            }
        }

        throw new IllegalArgumentException("No se encontró un evento con el nombre proporcionado y del tipo especificado.");
    }

    public void eliminarEvento(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        if (!eventos.remove(evento)) {
            throw new IllegalArgumentException("El evento no se encuentra en la lista.");
        }
    }

    public ArrayList<Evento> listarEventos(Class<?> tipoEvento) {
        List<Evento> eventosFiltrados = eventos.stream()
                                               .filter(tipoEvento::isInstance)
                                               .collect(Collectors.toList());
        
        return new ArrayList<>(eventosFiltrados);
    }

    public int calcularAforo(Evento evento) {
        if (evento == null) {
            throw new IllegalArgumentException("El evento no puede ser null.");
        }

        return evento.calcularAforo();
    }
    
  
}
