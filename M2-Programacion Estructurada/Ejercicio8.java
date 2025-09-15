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
public class Ejercicio8 {
    static double calcularPrecioFinal(double precioBase, double impuestoPct, double descuentoPct) {
        return precioBase + precioBase * (impuestoPct / 100.0) - precioBase * (descuentoPct / 100.0);
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese el precio base del producto: ");
    double base = sc.nextDouble();
    System.out.print("Ingrese el impuesto en porcentaje (Ej: 10 para 10%): ");
    double imp = sc.nextDouble();
    System.out.print("Ingrese el descuento en porcentaje (Ej: 5 para 5%): ");
    double desc = sc.nextDouble();
    double total = calcularPrecioFinal(base, imp, desc);
    System.out.println("El precio final del producto es: " + total);
    sc.close();
}
}


