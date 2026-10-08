package cooked.pkg1;
import java.util.Scanner;
public class Cooked1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
                 
        String producto;
        float precio;
        int cantidad;
        float subtotal;
        float iva;
        float total;
        
        System.out.println("Ingresa el nombre del producto: ");
        producto = leer.next();
        leer.nextLine();
        
        System.out.println("Ingrese el precio: ");
        precio = leer.nextFloat();
        leer.nextLine();
        
        System.out.println("Ingrese la cantidad de producto: ");
        cantidad = leer.nextInt();
        leer.nextLine();
        
        subtotal = precio * cantidad;
        iva = subtotal * 0.16f;
        total = subtotal + iva;
        
        System.out.println("TICKET DE COMPRA");
        System.out.println("Producto: "+producto);
        System.out.println("Precio del producto: "+precio);
        System.out.println("Cantidad: "+cantidad);
        System.out.println("Subtotal: $"+ subtotal);
        System.out.println("IVA del 16%: $"+ iva);
        System.out.println("Total: $"+ total);
        
        
                
    }
    
}
