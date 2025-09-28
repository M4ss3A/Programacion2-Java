package tp6.pkg1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        // Crear el inventario (ArrayList vacio)
        Inventario inv = new Inventario();

        // Agregar productos de ejemplo
        System.out.println("=== 1) Agregar productos ===");
        inv.agregarProducto(new Producto("001", "Smart TV 50\"", 200000, 6,  CategoriaProducto.ELECTRONICA));
        inv.agregarProducto(new Producto("002", "Hamburguesas x4",   2500, 10, CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("003", "Pantalin negro",   45000, 4,  CategoriaProducto.ROPA));
        inv.agregarProducto(new Producto("004", "Pan kg",             1500, 8,  CategoriaProducto.ALIMENTOS));
        inv.agregarProducto(new Producto("005", "Silla madera",      50000, 7,  CategoriaProducto.HOGAR));

        // Listar todos
        System.out.println("\n=== 2) Listado inicial ===");
        inv.listarProductos();

        // Buscar por ID y mostrar
        System.out.println("\n=== 3) Buscar producto por ID '003' ===");
        Producto buscado = inv.buscarProductoPorId("003");
        if (buscado != null) {
            System.out.println("Encontrado:");
            buscado.mostrarInfo();
        } else {
            System.out.println("No se encontri el ID 003");
        }

        // Filtrar por categoria
        System.out.println("\n=== 4) Filtrar por categoria: ALIMENTOS ===");
        ArrayList<Producto> alimentos = inv.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);
        imprimirLista(alimentos);
        
        // Eliminar por ID y listar de nuevo
        System.out.println("\n=== 5) Eliminar producto ID '005' ===");
        boolean elimino = inv.eliminarProducto("005");
        System.out.println("¿Se elimino? " + elimino);
        System.out.println("Listado luego de eliminar:");
        inv.listarProductos();

        // Actualizar stock
        System.out.println("\n=== 6) Actualizar stock de ID '002' a 15 ===");
        inv.actualizarStock("002", 15); // metodo  que imprime el resultado internamente
        System.out.println("Listado luego de actualizar stock:");
        inv.listarProductos();

        // Total de unidades
        System.out.println("\n=== 7) Total de unidades en stock ===");
        int total = inv.obtenerTotalStock();
        System.out.println("Total de unidades: " + total);

        // Producto con mayor stock
        System.out.println("\n=== 8) Producto con mayor stock ===");
        Producto max = inv.productoConMayorStock();
        if (max != null) {
            max.mostrarInfo();
        } else {
            System.out.println("Inventario vacio.");
        }

        // Filtrar por precio
        System.out.println("\n=== 9) Filtrar por precio entre $1.000 y $3.000 ===");
        ArrayList<Producto> rango = inv.filtrarProductosPorPrecio(1000, 3000);
        imprimirLista(rango);

        // Mostrar categorias con Descripciones(recorre el enum)
        System.out.println("\n=== 10) Categorias disponibles ===");
        inv.mostrarCategoriasDisponibles();

        System.out.println("\n------------------------------------------------------------------------------------------");
    }

    // Metodo auxiliar para imprimir el contenido de la lista de productos
    // Si la lista está vacia imprime "Sin resultados".
    private static void imprimirLista(ArrayList<Producto> lista) {
        if (lista == null || lista.isEmpty()) {
            System.out.println("(Sin resultados)");
            return;
        }
        for (Producto p : lista) {
            p.mostrarInfo();
        }
    }
}
