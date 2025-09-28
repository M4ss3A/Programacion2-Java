package tp6.pkg3;


public class Curso {
    private String codigo; // Codigo unico
    private String nombre; // Nombre
    private Profesor profesor;  // Profesor responsable

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { 
        return codigo; 
    }
    public void setCodigo(String codigo) { 
        this.codigo = codigo; 
    }

    public String getNombre() { 
        return nombre; 
    }
    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public Profesor getProfesor() { 
        return profesor; 
    }
    public void setProfesor(Profesor profesor) {
        if (profesor == this.profesor) 
            return;
        // Si tengo un profesor previo quita este curso de su lista
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        // Asigno el nuevo profesor 
        this.profesor = profesor;

        // Si el nuevo profesor no es null lo agrego
        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
    }
    // Salida simple por consola 
    public void mostrarInfo() {
        System.out.println("Curso");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombre: " + nombre);
        String nomProf = (profesor != null ? profesor.getNombre() : "(sin profesor)");
        System.out.println("Profesor asignado: " + nomProf);
    }
}
  
