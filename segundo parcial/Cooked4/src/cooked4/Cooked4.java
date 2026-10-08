package cooked4;
import java.util.Scanner;
public class Cooked4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int edad;
        int estatura;
        
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingresa tu estatura en centimetros: ");
        estatura = leer.nextInt();
        leer.nextLine();
        
        if (edad >= 12 && estatura >= 140) {
            System.out.println("Acceso permitido");
        } else {
            System.out.println("Acceso denegado");
        }
        
        
        

    }
    
}
