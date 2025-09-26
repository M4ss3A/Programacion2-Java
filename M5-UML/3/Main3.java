
package tp5.ejercicio3;

public class Main3 { 
    

    public static void main(String[] args) {
        Autor autor = new Autor("J. K. Rowling", "Britanica");
        Editorial editorial = new Editorial("Bloomburry", "50 Square, London");
        Libro libro = new Libro("Harry Potter ", "123-5235484", editorial);
        libro.setAutor(autor);

        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor().getNombre());
        System.out.println("Editorial: " + libro.getEditorial().getNombre());

    }
} 
