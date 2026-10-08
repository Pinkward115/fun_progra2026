package cooked2;
import java.util.Scanner;
public class Cooked2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num;
        
        System.out.println("Ingresa un numero entero: ");
        num = leer.nextInt();
        leer.nextLine();
        
        if (num > 0){
            System.out.println("El numero es positivo");
        }else
            if (num < 0){
                System.out.println("El numero es negativo");
            }else {
                System.out.println("El numero es igual a cero");
            }
    }   
}
