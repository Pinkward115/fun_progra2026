package cooked11;
import java.util.Scanner;
public class Cooked11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float a;
        float b;
        float resultado;
        int opcion;
        
        System.out.println("Ingresa el primer numero: ");
        a = leer.nextFloat();
        leer.nextLine();
        
        System.out.println("Ingrese el segundo numero: ");
        b = leer.nextFloat();
        leer.nextLine();
        
        System.out.println("CALCULADORA");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        
        System.out.println("Selecciona una opcion: ");
        opcion = leer.nextInt();
        leer.nextLine();
        
        switch (opcion) {
            case 1:
                resultado = a + b;
                System.out.println("Resultado: "+ resultado);
                break;
                
            case 2:
                resultado = a - b;
                System.out.println("Resultado: "+ resultado);
                break;
                
            case 3:
                resultado = a * b;
                System.out.println("Resultado: "+ resultado);
                break;
                
            case 4:
                if (b != 0) {
                resultado = a / b;
                    System.out.println("Resultado: "+ resultado);
            } else {
                    System.out.println("No se puede dividir entre cero");
                }
                break;
                
            default:
                System.out.println("Opcion no valida");
        }

    }
    
}
