package excepciones3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\Masse\\Programacion2-Java\\M8-Interfaces y Excepciones");
        try(BufferedReader br = new BufferedReader(new FileReader(archivo))){
            System.out.println(br.readLine());  
        } catch(IOException ex) {
            System.out.println("Error: "+ ex.getMessage());
        } 
    }
}

