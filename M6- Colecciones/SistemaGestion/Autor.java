package tp6.pkg2;


public class Autor {
    // Atributos de la clase Autor
    private String id;            // Identificador unico del autor
    private String nombre;        // Nombre del autor
    private String nacionalidad;  // Nacionalidad del autor

    // Constructor completo
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters & setters 
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
    public String getNacionalidad() { 
        return nacionalidad; 
    }
    public void setNacionalidad(String nacionalidad) { 
        this.nacionalidad = nacionalidad; 
    }

    // Muestra informacion del autor
    public void mostrarInfo() {
        System.out.println("id= " + id);
        System.out.println("Nombre= " + nombre);
        System.out.println("Nacionalidad= " + nacionalidad);
    }
}
  
