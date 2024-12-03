package es.santander.ascender.proyecto11;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class GestionEstudiantes implements IGestionEstudiantes{

    private Map<String, Integer> estudiantes;

    public GestionEstudiantes(){
         estudiantes = new HashMap<>();
    }

    @Override
    public boolean agregarEstudiante(String nombre, int calificacion) {
        if(estudiantes.containsKey(nombre)) {
        return false; 
     }
     estudiantes.put(nombre, calificacion);
        return true;
}

    @Override
    public void agregarEstudiantes(Set<String> nuevosEstudiantes, Map<String, Integer> nuevasCalificaciones) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public boolean eliminarEstudiante(String nombre) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean existeEstudiante(String nombre) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Integer obtenerCalificacion(String nombre) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Map<String, Integer> obtenerEstudiantesYCalificaciones() {
        // TODO Auto-generated method stub
        return null;
    }
    

}
