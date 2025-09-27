package tp6.pkg1;


    public enum CategoriaProducto {    //Definicion de valores del enum
    ALIMENTOS("Productos comestibles"),
    ELECTRONICA("Dispositivos electronicos"),
    ROPA("Prendas de vestir"),
    HOGAR("Artículos para el hogar");

    // Atributo interno del enum
    private final String descripcion;
        CategoriaProducto(String descripcion) { //Constructor del enum
        this.descripcion = descripcion; 
    }
    public String getDescripcion() { // Devuelve descripcion de la categoria
        return descripcion; 
    }
}

