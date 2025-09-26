
package tp5.ejercicio2;

public class Main2 {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Ayelen Masseroni", "39600348");
        Bateria bateria = new Bateria("f-84", 1000);
        Celular celular = new Celular("Iphone", "14", "123456789012345", bateria);
        usuario.setCelular(celular);
        System.out.println("Usuario: " + celular.getUsuario().getNombre());
        System.out.println("Batería: " + celular.getBateria().getModelo());
    }  
}

