package tp6.pkg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;


public class Biblioteca {
    private String nombre;
    // Composicion 1:N 
    private List<Libro> libros;

    //Crea una biblioteca con un nombre y una lista vacia
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    // Getter & setter
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

  
//METODOS
    // Crea un Libro con los datos recibidos y lo agrega 
    // Devuelve true si se agrego correctamente.
    public boolean agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (isbn == null || titulo == null || autor == null) return false;
        Libro l = new Libro(isbn, titulo, anioPublicacion, autor);
        return libros.add(l);
    }

    // Lista todos los libros con su informacion y la del autor
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("No hay libros en la biblioteca.");
            return;
        }
        for (Libro l : libros) {
            l.mostrarInfo(); 
            if (l.getAutor() != null) {
                System.out.println("Detalle del autor:");
                l.getAutor().mostrarInfo();
            }
        }
    }

    // Busca un libro por ISBN 
    //Retorna el libro si lo encuentra o null si no existe
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equalsIgnoreCase(isbn)) {
                return l;
            }
        }
        return null;
    }

    // Eliminar
 public boolean eliminarLibro(String isbn) {
    if (isbn != null) {
        Libro libroEliminar = this.buscarLibroPorIsbn(isbn);
        if (libroEliminar != null) {
            libros.remove(libroEliminar);
            return true;
        }
    }
    return false;
}

    // Cantidad total 
    public int obtenerCantidadLibros() {
        return libros.size();
    }

    // filtrar los libros por año
   public List<Libro> filtrarLibrosPorAnio(int anio){
        List<Libro> libroPorAnio=new ArrayList();
        for(Libro libro:libros){
            if(libro.getAnioPublicacion()==anio){
                libroPorAnio.add(libro);
            }     
        }
        return Collections.unmodifiableList(libroPorAnio);
    }

    // Muestra los autores de los libros disponibles
  public void mostrarAutoresDisponibles(){
    for (Libro libro : libros) {
        if (libro.getAutor() != null) {
            libro.getAutor().mostrarInfo();
            System.out.println("--------------------");
        }
    }
  }
}

    
   