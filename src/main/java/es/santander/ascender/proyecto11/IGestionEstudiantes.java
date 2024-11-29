package es.santander.ascender.proyecto11;

import java.util.Set;
import java.util.Map;

public interface IGestionEstudiantes {
    boolean agregarEstudiante(String nombre, int calificacion);
    Integer obtenerCalificacion(String nombre);
    Map<String, Integer> obtenerEstudiantesYCalificaciones();
    boolean existeEstudiante(String nombre);
    boolean eliminarEstudiante(String nombre);
    void agregarEstudiantes(Set<String> nuevosEstudiantes, Map<String, Integer> nuevasCalificaciones);
}