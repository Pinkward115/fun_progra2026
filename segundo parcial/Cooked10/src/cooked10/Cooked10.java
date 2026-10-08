package cooked10;
import java.util.Scanner;
public class Cooked10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int opcion;
        
        System.out.println("MENU DE CAFETERIA");
        System.out.println("1. Cafe - $35");
        System.out.println("2. Te - $30");
        System.out.println("3. Chocolate - $45");
        System.out.println("4. Agua - $20");
        
        System.out.println("Selecciona una opcion: ");
        opcion = leer.nextInt();
        leer.nextLine();
        
        switch (opcion) {
            case 1:
                System.out.println("Producto seleccionado: Cafe");
                System.out.println("Precio: $35");
                break;
                
            case 2:
                System.out.println("Producto seleccionado: Te");
                System.out.println("Precio: $30");
                break;
                
            case 3:
                System.out.println("Producto seleccionado: Chocolate");
                System.out.println("Precio: $45");
                break;
                
            case 4:
                System.out.println("Producto seleccionado: Agua");
                System.out.println("Precio: $20");
                break;
                
            default:
                System.out.println("Opcion no valida");
        }

    }
    
}
