package tp6.pkg3;

import java.util.ArrayList;
import java.util.List;


public class Universidad {
    private String nombre;
    private List<Curso> cursos;
    private List<Profesor> profesores;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.cursos = new ArrayList<>();
        this.profesores = new ArrayList<>();
    }

    // Agregar profesor 
    public void agregarProfesor(Profesor profesor) {
        if (profesor != null && !profesores.contains(profesor)) {
            profesores.add(profesor);
        }
    }

    // Agregar curso 
    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
        }
    }

    // Eliminar profesor
    public void eliminarProfesor(Profesor profesor) {
        if (profesor != null && profesores.contains(profesor)) {
            for (Curso curso : new ArrayList<>(profesor.getCursos())) {
                curso.setProfesor(null);
            }
            profesores.remove(profesor);
        }
    }

    // Eliminar curso
    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            curso.setProfesor(null);
            cursos.remove(curso);
        }
    }

    // Lista profesores
    public void listarProfesor() {
        System.out.println("La universidad " + nombre + " tiene " + profesores.size() + " profesores:");
        if (profesores.isEmpty()) {
            System.out.println("(sin profesores)");
            return;
        }
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
            System.out.println("--------------------");
        }
    }
    // Lista los cursos
    public void listarCursos() {
        System.out.println("La universidad " + nombre + " tiene " + cursos.size() + " cursos:");
        if (cursos.isEmpty()) {
            System.out.println("Sin cursos");
            return;
        }
        for (Curso curso : cursos) {
            curso.mostrarInfo();
            System.out.println("--------------------");
        }
    }

    // Buscar profesor por ID
    public Profesor buscarProfesorPorId(String id) {
        if (id != null) {
            for (Profesor profesor : profesores) {
                if (profesor.getId().equals(id)) return profesor;
            }
        }
        return null;
    }
    // Buscar curso por el codigo
    public Curso buscarCursoPorCodigo(String codigo) {
        if (codigo != null) {
            for (Curso curso : cursos) {
                if (curso.getCodigo().equals(codigo)) return curso;
            }
        }
        return null;
    }

    // Vincular profesor y curso 
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesor = this.buscarProfesorPorId(idProfesor);
        Curso curso = this.buscarCursoPorCodigo(codigoCurso);
        if (profesor != null && curso != null) {
            curso.setProfesor(profesor); // Relación bidireccional
        } else {
            System.out.println("No existe el profesor o el curso en la universidad " + nombre);
        }
    }
}

