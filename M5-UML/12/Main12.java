package tp5.ejercicio12;


public class Main12 {
    public static void main(String[] args) {
        Contribuyente contribuyente = new Contribuyente("Ayelen Masseroni", "27-1235487-7");
        Impuesto impuesto = new Impuesto(70000.0, contribuyente);
        Calculadora calc = new Calculadora();
        calc.calcular(impuesto); //Dependencia de uso
    }
    
}
