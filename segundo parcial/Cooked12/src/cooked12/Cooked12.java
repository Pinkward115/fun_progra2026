package cooked12;
import java.util.*;
public class Cooked12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float saldo = 5000;
        int opcion;
        
        System.out.println("CAJERO AUTOMATICO");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar $500");
        System.out.println("3. Retirar $1000");
        System.out.println("4. Retirar $2000");
        
        System.out.println("Selecciona una opcion: ");
        opcion = leer.nextInt();
        leer.nextLine();
        
        switch (opcion) {
            
            case 1:
                System.out.println("Saldo disponible: $"+ saldo);
                break;
                
            case 2:
                if (saldo >= 500) {
                    saldo = saldo - 500;
                    System.out.println("Retiro realizado: $500");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;
                
            case 3:
                if (saldo >= 1000) {
                    saldo = saldo - 1000;
                    System.out.println("Retiro realizado: $1000");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;
                
            case 4:
                if (saldo >= saldo - 2000) {
                    saldo = saldo - 2000;
                    System.out.println("Retiro realizado: $2000");
                } else {
                    System.out.println("Saldo insuficiente");
                }
                break;
                
            default:
                System.out.println("Opcion no valida");
        }
        
        System.out.println("Saldo final: $"+ saldo);

    }
    
}
