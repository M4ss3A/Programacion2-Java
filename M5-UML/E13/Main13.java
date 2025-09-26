package tp5.ejercicio13;


public class Main13 {
    public static void main(String[] args) {
        Usuario user = new Usuario("AMasse", "Masseroni1@hotmail.com");
        GeneradorQR gen = new GeneradorQR();
        gen.generar("1598F", user); // dependencia de creación
    }
}
