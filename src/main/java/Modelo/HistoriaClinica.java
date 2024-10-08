
package Modelo;


import java.util.*;

public class HistoriaClinica {
    private Paciente paciente;
    private Map<String, List<Consulta>> visitasMedicas;

    public HistoriaClinica(Paciente paciente) {
        this.paciente = paciente;
        this.visitasMedicas = new HashMap<>();
    }

    public void agregarVisita(String fecha, Consulta visita) {
        visitasMedicas.putIfAbsent(fecha, new ArrayList<>());
        visitasMedicas.get(fecha).add(visita);
    }

    public List<Consulta> obtenerVisitasPorFecha(String fecha) {
        return visitasMedicas.getOrDefault(fecha, new ArrayList<>());
    }

    // Eliminar una visita médica específica en una fecha
    public boolean eliminarVisita(String fecha, Consulta visita) {
        List<Consulta> visitas = visitasMedicas.get(fecha);
        if (visitas != null) {
            boolean removed = visitas.remove(visita);
            if (visitas.isEmpty()) {
                visitasMedicas.remove(fecha);  // Elimina la fecha si no hay más visitas
            }
            return removed;
        }
        return false;
    }

    public List<Consulta> obtenerTodasLasVisitas() {
        List<Consulta> todasLasVisitas = new ArrayList<>();
        for (List<Consulta> visitas : visitasMedicas.values()) {
            todasLasVisitas.addAll(visitas);
        }
        return todasLasVisitas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public boolean eliminarVisitasPorFecha(String fecha) {
        return visitasMedicas.remove(fecha) != null;
    }

    public Set<String> obtenerFechasDeVisitas() {
        return visitasMedicas.keySet();
    }
}

