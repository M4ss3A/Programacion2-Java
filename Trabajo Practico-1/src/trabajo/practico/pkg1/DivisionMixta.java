/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo.practico.pkg1;

/**
 *
 * @author Masse
 */
import java.util.Scanner;
public class DivisionMixta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresá el primer entero: ");
        int a = sc.nextInt();

        System.out.print("Ingresá el segundo entero: ");
        int b = sc.nextInt();

        if (b != 0) {
            int divEntera = a / b;                 // trunca
            double divReal = (double) a / b;       // casting para obtener decimales

            System.out.println("División (int): " + divEntera);
            System.out.println("División (double): " + divReal);
        } else {
            System.out.println("No se puede dividir por cero.");
        }
        sc.close();
    }
}
