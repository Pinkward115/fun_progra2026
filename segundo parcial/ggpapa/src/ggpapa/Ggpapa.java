package ggpapa;
import java.util.Scanner;
public class Ggpapa {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        for(int i=1; i<=5; i++){
            
            System.out.println("Ingresa un numero: ");
            int numero = leer.nextInt();
            
            if(numero % 2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
        }
    }
    
}

