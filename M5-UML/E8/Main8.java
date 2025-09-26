package tp5.ejercicio8;


public class Main8 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ayelen Masseroni", "masseronia@gmail.com");
        Documento doc = new Documento("Contrato", "Contenido", "Amasse", "10/10/2025", usuario);

        System.out.println("Documento: " + doc.getTitulo());
        System.out.println("Usuario de la firma: " + doc.getFirma().getUsuario().getNombre());
        System.out.println("Hash de firma: " + doc.getFirma().getCodigoHash());
    }
}
