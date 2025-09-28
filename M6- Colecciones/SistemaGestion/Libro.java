package tp6.pkg2;


public class Libro {
    //Atributos de la clase Libro
    private String isbn;  // Identificador unico del libro
    private String titulo; // Titulo del libro
    private int anioPublicacion; // Anio de publicacion
    private Autor Autor;// Referencia al autor del libro
  

    // Constructor
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.Autor = autor;
    } 
    
   // Getters & Setter
        public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public Autor getAutor() {
        return Autor;
    }
    
    public void setAutor(Autor Autor) {
        this.Autor = Autor;
    }
    
    //Metodo Mostrar info
    public void mostrarInfo() {
        System.out.println("\nLibro");
        System.out.println("Titulo= " + titulo);
        System.out.println("ISBN= " + isbn);
        System.out.println("Anio publicacion= " + anioPublicacion);
        String nombreAutor = (Autor != null ? Autor.getNombre() : "(sin autor)");
        System.out.println("Autor= " + nombreAutor);
    }
  
}