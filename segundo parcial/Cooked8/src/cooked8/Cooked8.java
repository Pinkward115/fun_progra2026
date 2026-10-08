package cooked8;
import java.util.Scanner;
public class Cooked8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
         
        int edad;
        float ingreso;
        
        System.out.println("Ingresa tu edad: ");
        edad = leer.nextInt();
        leer.nextLine();
        
        if (edad >= 18) {
            
            System.out.println("Ingresa tu ingreso mensual: ");
            ingreso = leer.nextFloat();
            leer.nextLine();
            
            if ( ingreso >= 15000 ){
                System.out.println("Candidato a prestamo");
            } else {
                System.out.println("Ingreso insuficiente");
            }
        } else {
            System.out.println("No cumple con la edad requerida");
        }
        
        

    }
    
}
