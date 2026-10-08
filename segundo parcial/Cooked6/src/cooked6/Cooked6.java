package cooked6;
import java.util.Scanner;
public class Cooked6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        float calificacion1;
        float calificacion2;
        float calificacion3;
        float promedio;
        
        System.out.println("Ingresa la primera calificacion: ");
        calificacion1 = leer.nextFloat();
        leer.nextLine();
        
        System.out.println("Ingresa la segunda calificacion: ");
        calificacion2 = leer.nextFloat();
        leer.nextLine();
        
        System.out.println("Ingrese su tercera calificacion: ");
        calificacion3 = leer.nextFloat();
        leer.nextLine();
        
        if (calificacion1 < 0 || calificacion1 > 10 || calificacion2 < 0 || calificacion2 > 10 || calificacion3 < 0 || calificacion3 > 10) {
            System.out.println("Calificacion invalida");
        } else {
            promedio = (calificacion1 + calificacion2 + calificacion3) / 3;
            System.out.println("Promedio: "+ promedio);
            
            if (promedio < 6){
                System.out.println("reprobado GGpapa");
            } else
                if (promedio >= 6 && promedio <=7.9) {
                    System.out.println("Aprobado");
                } else
                    if (promedio >= 8 && promedio <=8.9) {
                        System.out.println("Buen desempeño");
                    } else
                        if (promedio >= 9 && promedio <=10) {
                            System.out.println("Exelente");
                        }
        }
        
        
        

    }
    
}
