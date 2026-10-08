package pkgswitch.calculadora;
import java.util.*;
public class SwitchCalculadora {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int a;
        float num1;
        float num2;
        
        System.out.println("igrese primer numero para operaciones");
        num1 = leer.nextFloat();
        leer.nextLine();
        
        System.out.println("ingrese segundo numero para operaciones");
        num2 = leer.nextFloat();
        leer.nextLine();
        
         System.out.println("Ingrese un numero del 1 al 4, 1 para suma, 2 para resta, 3 para multiplicacion y 4 para divicion");
        a = leer.nextInt();
        leer.nextLine();
        
        switch(a){
            case 1:
                System.out.println("Suma: "+(num1+num2));
                break;
            case 2:
                System.out.println("resta: "+(num1-num2));
                break;
            case 3:
                System.out.println("mutiplicacion: "+(num1*num2));
                break;
            case 4:
                System.out.println("divicion: "+(num1/num2));
                break;
        }
        
        

        
        
        
        

    }
    
}
