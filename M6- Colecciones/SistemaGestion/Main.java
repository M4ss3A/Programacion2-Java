package tp6.pkg2;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        // Crear biblioteca
        System.out.println("=== 1) Crear biblioteca ===");
        Biblioteca bib = new Biblioteca("Biblioteca Central");

        // Crear al menos tres autores
        System.out.println("\n=== 2) Crear autores ===");
        Autor a1 = new Autor("A001", "Jorge L. Borges", "Argentina");
        Autor a2 = new Autor("A002", "Julio Cortazar", "Argentina");
        Autor a3 = new Autor("A003", "Isabel Allende", "Chile");

        // Agregar 5 libros asociados a alguno de los autores
        System.out.println("\n=== 3) Agregar 5 libros ===");
        bib.agregarLibro("978-987-4019-01-0", "El Aleph", 1949, a1);
        bib.agregarLibro("978-950-547-201-5", "Rayuela", 1963, a2);
        bib.agregarLibro("978-987-566-812-6", "Ficciones", 1944, a1);
        bib.agregarLibro("978-987-1234-567-8", "La casa de los espiritus", 1982, a3);
        bib.agregarLibro("978-987-580-081-6", "Bestiario", 1951, a2);

        // Listar todos los libros con info y la del autor
        System.out.println("\n=== 4) Listar libros ===");
        bib.listarLibros();

        // Buscar un libro por su ISBN y mostrar su informacion
        System.out.println("\n=== 5) Buscar libro por ISBN ===");
        String isbnBuscado = "978-950-547-201-5";
        System.out.println("Buscando ISBN: " + isbnBuscado);
        Libro encontrado = bib.buscarLibroPorIsbn(isbnBuscado);
        if (encontrado != null) {
            System.out.println("Encontrado:");
            encontrado.mostrarInfo();
            System.out.println("Autor (detalle):");
            encontrado.getAutor().mostrarInfo();
        } else {
            System.out.println("No se encontro ese ISBN.");
        }

        // Filtrar y mostrar los libros publicados en un año
        int anioFiltro = 1949;
        System.out.println("\n=== 6) Filtrar libros por anio " + anioFiltro + " ===");
        List<Libro> librosPorAnio = bib.filtrarLibrosPorAnio(anioFiltro);
        if (librosPorAnio.isEmpty()) {
            System.out.println("(Sin resultados)");
        } else {
            for (Libro l : librosPorAnio) {
            l.mostrarInfo();
            System.out.println("--------------------");
    }
}
        // Eliminar un libro por su ISBN y listar los restantes
        System.out.println("\n=== 7) Eliminar libro por ISBN (Bestiario) ===");
        boolean elimino = bib.eliminarLibro("978-987-580-081-6"); 
        System.out.println("Se elimino? " + elimino);
        System.out.println("Listado tras eliminar:");
        bib.listarLibros();

        // Mostrar la cantidad total de libros
        System.out.println("\n=== 8) Cantidad total de libros ===");
        System.out.println("Total: " + bib.obtenerCantidadLibros());

        // Listar todos los autores de los libros disponibles
        System.out.println("\n=== 9) Autores disponibles ===");
        bib.mostrarAutoresDisponibles();
    }
}
