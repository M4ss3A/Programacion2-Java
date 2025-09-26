package tp5.ejercicio11;


public class Main11 {
    public static void main(String[] args) {
        Artista artista = new Artista("Bad Bunny", "Pop");
        Cancion cancion = new Cancion("Debi tirar mas fotos", artista);
        Reproductor r = new Reproductor();
        r.reproducir(cancion); // Dependencia de uso
    }   
}
