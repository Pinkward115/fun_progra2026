package ejercicio.pkgfor;
import java.util.Scanner;
public class EjercicioFor {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int suma = 0;
        
        System.out.println("Ingresa tu numero entero positivo: ");
        n = leer.nextInt();
        leer.nextLine();
        
        for(int i=1; i<=n; i++){
            if (i%2==0){
                System.out.println(i);
                suma = suma + i;
            }
        }
        System.out.println(suma);

    } 
    
}
