package cooked5;
import java.util.Scanner;
public class Cooked5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float subtotal;
        float descuento;
        float total;
        
        System.out.println("Ingresa tu monto total de la compra: ");
        subtotal = leer.nextFloat();
        leer.nextLine();
        
        if (subtotal >= 1000) {
            descuento = subtotal * 0.10f;
        } else {
            descuento = 0;
        }
        
        total = subtotal - descuento;
        
        System.out.println("TICKET");
        System.out.println("subtotal: $"+ subtotal);
        System.out.println("descuento: $"+ descuento);
        System.out.println("Total: $"+ total);
        
        

    }
    
}
