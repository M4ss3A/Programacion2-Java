package excepciones;
import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un texto para ser convertido a entero");
        String textoAConvertir = scan.nextLine();
        
        try {
            int textoConvertido = Integer.parseInt(textoAConvertir);
            System.out.println("El numero convertido es: " + textoConvertido);
        } catch (NumberFormatException ex) {
            System.out.println("Error - No valido");
        }
    }
}
    
