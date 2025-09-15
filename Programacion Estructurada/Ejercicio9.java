/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajopractico.pkg2;
import java.util.*;
/**
 *
 * @author Masse
 */
public class Ejercicio9 {
    static double calcularCostoEnvio(double peso, String zona) {
        String z = zona.trim().toLowerCase();
        if (z.equals("nacional")) return 5.0 * peso;
        if (z.equals("internacional")) return 10.0 * peso;
        return -1; // inválida
}
static double calcularTotalCompra(double precioProducto, double costoEnvio) {
    return precioProducto + costoEnvio;
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el precio del producto: ");
    double precio = sc.nextDouble();
    System.out.print("Ingrese el peso del paquete en kg: ");
    double peso = sc.nextDouble();
    System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
    String zona = sc.next();
    double envio = calcularCostoEnvio(peso, zona);
    if (envio < 0) {
        System.out.println("Zona inválida.");
    } else {
        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " + calcularTotalCompra(precio, envio));
    }
    sc.close();
}
}



