package punto1.servicio;

import punto1.modelo.*;
import java.util.*;

public class SistemaAcademico {

    private List<Estudiante> estudiantes = new ArrayList<>();

    public void agregarEstudiante(String nombre, double nota) {
        estudiantes.add(new Estudiante(nombre, nota));
    }

    public void mostrarEstudiantes() {
        for (Estudiante e : estudiantes) {
            System.out.println(e.getNombre() + " - Nota: " + e.getNota());
        }
    }
}