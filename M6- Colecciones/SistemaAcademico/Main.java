package tp6.pkg3;


public class Main {

    
    public static void main(String[] args) {
        // Crea universidad
        Universidad uni = new Universidad("UTN");

        // Instancia los Profesores 
        Profesor p1 = new Profesor("P001", "Ana Perez", "Programacion");
        Profesor p2 = new Profesor("P002", "Luis Gomez", "Bases de Datos");
        Profesor p3 = new Profesor("P003", "Carla Diaz", "Redes");

        // Agregar profesores a universidad
        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        // Instancia los cursos
        Curso c1 = new Curso("C101", "Algoritmos I");
        Curso c2 = new Curso("C102", "Estructuras de Datos");
        Curso c3 = new Curso("C103", "Base de Datos I");
        Curso c4 = new Curso("C104", "Redes I");
        Curso c5 = new Curso("C105", "Programacion Orientada a Objetos");

        // Agrega los cursos a universidad
        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        // Listados iniciales
        System.out.println("=== Profesores (inicial) ===");
        uni.listarProfesor();
        System.out.println("\n=== Cursos (inicial) ===");
        uni.listarCursos();

        //Asignaciones usando asignarProfesorACurso
        System.out.println("\n=== Asignar profesores a cursos ===");
        uni.asignarProfesorACurso("C101", "P001"); // Ana -> Algoritmos I
        uni.asignarProfesorACurso("C102", "P001"); // Ana -> Estructuras de Datos
        uni.asignarProfesorACurso("C103", "P002"); // Luis -> BD I
        uni.asignarProfesorACurso("C104", "P003"); // Carla -> Redes I

        System.out.println("\n=== Cursos tras asignar ===");
        uni.listarCursos();

        // Reasignacion de profesor a un curso 
        System.out.println("\n=== Reasignar C102 a P003 ===");
        uni.asignarProfesorACurso("C102", "P003");
        uni.listarCursos();

        // Mostrar cursos por profesor 
        System.out.println("\n=== Cursos de Ana (P001) ===");
        p1.listarCursos();
        System.out.println("\n=== Cursos de Carla (P003) ===");
        p3.listarCursos();

        // Eliminar un curso y verificar desasignacion en el profesor
        System.out.println("\n=== Eliminar curso C101 ===");
        Curso aBorrar = uni.buscarCursoPorCodigo("C101");
        uni.eliminarCurso(aBorrar);
        System.out.println("\n=== Cursos luego de eliminar C101 ===");
        uni.listarCursos();
        System.out.println("\n=== Cursos de Ana (P001) luego de eliminar C101 ===");
        p1.listarCursos();

        System.out.println("\nFin de la demo.");
    }
}
