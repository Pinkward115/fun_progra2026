package ejercicio.pkgfor.pkg2;
import java.util.*;
public class EjercicioFor2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int n;
        int mayor = 0;
        int num;
        
        System.out.println("Ingresa el numero de numeros que quieras ingresar: ");
        n = leer.nextInt();
        leer.nextLine();
        
        for(int i=1; i<=n; i++){
            System.out.println("Igresa tu numero"+ i +": ");
        num = leer.nextInt();
        leer.nextLine();
        if(i==1 || num > mayor){
            mayor = num;
        }
        }
        System.out.println("El numero mayor es: "+ mayor);
    }
}

