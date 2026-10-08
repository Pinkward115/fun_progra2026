package cooked3;
import java.util.Scanner;
public class Cooked3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        int num1;
        int num2;
        
        System.out.println("Ingresa el primer numero entero: ");
        num1 = leer.nextInt();
        leer.nextLine();
        
        System.out.println("Ingresa el segundo numero entero: ");
        num2 = leer.nextInt();
        leer.nextLine();
        
        if (num1 > num2){
            System.out.println("El numero mayor es:"+ num1);
        } else
            if (num2 > num1){
                System.out.println("El numero mayor es: "+ num2);
            } else {
                System.out.println("Los numeros son iguales que paso papi?");
            }
        
        
        

    }
    
}
