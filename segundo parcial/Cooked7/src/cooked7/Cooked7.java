package cooked7;
import java.util.Scanner;
public class Cooked7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int edad;
        int pin;
        
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
        leer.nextLine();
        
        if (edad >= 18) {
        
        System.out.println("Ingresa tu PIN: ");
        pin = leer.nextInt();
        leer.nextLine();
        
        if (pin == 1234) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("PIN incorrecto");
        }
        
        } else {
            System.out.println("Acceso no permitido");
        }

    }
    
}
