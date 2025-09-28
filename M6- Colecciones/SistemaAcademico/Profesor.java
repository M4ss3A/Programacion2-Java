package tp6.pkg3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { 
        return id; 
    }
    public void setId(String id) { 
        this.id = id; 
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getEspecialidad() { 
        return especialidad; 
    }
    public void setEspecialidad(String especialidad) { 
        this.especialidad = especialidad; 
    }

    // Devuelve una vista de solo lectura para evitar que desde afuera modifiquen la lista
    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    // Agrega un curso a mi lista y asegura la relación desde el lado Curso
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this); // asegura coherencia bidireccional
            }
        }
    }
    // Quita un curso de mi lista 
    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null); // rompe la relación del otro lado
            }
        }
    }

    // Listado de cursos asignados 
    public void listarCursos() {
        System.out.println("Cursos del profesor " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("(sin cursos)");
            return;
        }
        for (Curso c : cursos) c.mostrarInfo();
    }

    public void mostrarInfo() {
        System.out.println("Profesor");
        System.out.println("id: " + id);
        System.out.println("Nombre: " + nombre);
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Dicta " + cursos.size() + " curso(s).");
    }
}
