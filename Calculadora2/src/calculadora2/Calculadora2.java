package calculadora2;
import java.util.Scanner;



public class Calculadora2 {

    public static void main(String[] args) {
        // TODO code application logic here
       Scanner lectura = new Scanner(System.in);
       int n1,n2,n3;
        System.out.println("Escribe tu numero 1: ");
        n1=lectura.nextInt();
        System.out.println("Escribe tu numero 2: ");
        n2=lectura.nextInt();
        System.out.println("Escribe tu numero 3: ");
        n3=lectura.nextInt();
        int res;
        res=(n1*n2*n3);
        System.out.println("El resultado es"+(n1*n2*n3));
        System.out.println("El resultado con res "+res);
    }
    
}
