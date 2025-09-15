
package trabajo.practico.pkg1;

/**
 *
 * @author Masse
 */
import java.util.Scanner;
public class Operaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Numero 1: ");
        int a = sc.nextInt();

        System.out.print("Numero 2: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b)); // división entera (trunca decimales)
        } else {
            System.out.println("Division: no se puede dividir por cero");
        }

        sc.close();
    }
}
