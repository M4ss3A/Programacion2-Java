package tp6.pkg1;

import java.util.ArrayList;


public class Inventario {

    // Relación 1:N - Instaciamienyo para guardar productos
    private ArrayList<Producto> productos;

    //Constructor que inicializa la lista vacia
    public Inventario() {
        this.productos = new ArrayList<>();
    }

    // Agregar producto a la lista
    public boolean agregarProducto(Producto p) {
        if (p == null) 
            return false;
        return productos.add(p);
    }

    // Lista todos los productos usando for-each.
    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos cargados."); // Si esta vacio
            return;
        }
        for (Producto p : productos) {
            p.mostrarInfo();
        }
    }

    //Buuscar producto por ID
    //Devuelve el producto o null si no existe.
 
    public Producto buscarProductoPorId(String id) {
        for (Producto p : productos) {
            if (p.getId().equalsIgnoreCase(id)) {
                return p;
            }
        }
        return null;
    } 

    //Elimina por ID. (Devuelve true si elimino uno)
     
    public boolean eliminarProducto(String id) {
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i).getId().equalsIgnoreCase(id)) {
                productos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    // Actualizar el Stock de producto existente
   public void actualizarStock(String id, int nuevaCantidad) {
        Producto p = buscarProductoPorId(id);
        if (p != null && nuevaCantidad > 0) {
            p.setCantidad(nuevaCantidad);
            System.out.println("El stock se actualizo.");
        } else if (nuevaCantidad < 0) {
            System.out.println("Debe ingresar una cantidad positiva.");
        } else if (p == null) {
            System.out.println("ID no encontrado!");
        }
    }

  // Filtra y devuelve lista con productos de la categoria indicada
    public ArrayList<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        ArrayList<Producto> resultado = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getCategoria() == categoria) {
                resultado.add(p);
            }
        }
        return resultado;
    }

    // Suma total de unidades disponibles
    public int obtenerTotalStock() {
        int total = 0;
        for (Producto p : productos) {
            total += p.getCantidad();
        }
        return total;
    }

   // Producto con mayou stock - null si esta vacia
    public Producto productoConMayorStock() {
        int maxStock = -1;
        Producto productoConMayorStock = null;
        for (Producto p : productos) {
            if (p.getCantidad() >= maxStock) {
                maxStock = p.getCantidad();
                productoConMayorStock = p;
            }
        }

        return productoConMayorStock;
    }

    // Productos que el precio esta entre el min y el max
    public ArrayList<Producto> filtrarProductosPorPrecio(double min, double max) {
        ArrayList<Producto> resultadom = new ArrayList<>();
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max) {
                resultadom.add(p);
            }
        }
        return resultadom;
    }
    
    // Muestra todas las categorias y su descripcion 
    public void mostrarCategoriasDisponibles() {
        System.out.println("Las categorías disponibles son:");
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println("- " + c + " → " + c.getDescripcion());
        }
    }
}

