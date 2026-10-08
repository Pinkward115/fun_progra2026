package cooked9;
import java.util.Scanner;
public class Cooked9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        int num3;
        
        System.out.println("Ingresa el primer numero: ");
        num1 = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingresa el segudo numero: ");
        num2 = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingresa el tercer numero: ");
        num3 = leer.nextInt();
        leer.nextLine();
        
        if (num1 == num2 && num2 == num3) {
            System.out.println("Los 3 numeros son iguales");
        } else
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("El numero mayor es: "+ num1);
            } else
                if (num2 >= num1 && num2 >= num3) {
                    System.out.println("El numero mayor es: "+ num2);
                } else {
                    System.out.println("El numero mayor es: "+ num3);
                }
    }
    
}
