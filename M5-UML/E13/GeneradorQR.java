package tp5.ejercicio13;


public class GeneradorQR {
      public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR del usuario: " + qr.getUsuario().getNombre() + " - Valor: " + qr.getValor());
      }
}
