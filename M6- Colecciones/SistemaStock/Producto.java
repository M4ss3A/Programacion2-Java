package tp6.pkg1;


public class Producto {   
    // Atributos de la clase producto
    private String id;  //Idenificador
    private String nombre; // Nombre del producto
    private double precio; // Valor
    private int cantidad; // Cantidad de stock
    private CategoriaProducto categoria; // Categoria enum

    //Constructor con Argumentos
    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    // Getters & Setters
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaProducto categoria) {
        this.categoria = categoria;
    }
    

   public void mostrarInfo(){
       System.out.println("\nProducto ");
       System.out.println("id= " + id);
       System.out.println("Nombre= " + nombre);
       System.out.println("Precio= " + precio);
       System.out.println("Stock= " + cantidad);
       System.out.println("Categoria= " + categoria);
   }
}
