
package pkgif.anidado;
import java.util.Scanner;
public class IfAnidado {

    public static void main(String[] args) {
   Scanner leer = new Scanner(System.in);
   int num;
   
        System.out.println("dia del mes: ");
        num = leer.nextInt();
        leer.nextLine();
        
        if(num<=0){
            System.out.println("error");
        }else
        
        if (num>=1 && num<=7){
            System.out.println("estas en la semana 1");
        }else
            if(num>=8 && num<=14){
                System.out.println("Estas en la semana 2");
            }else
                if(num>=15 && num<=21){
                    System.out.println("Estas en la semana 3");
    }else
                    if(num>=22 && num<=28){
                        System.out.println("Estas en la semana 4");
                        
                    }else
                        if(num>=29 && num<=31){
                            System.out.println("Estas en la semana 5");
                        }else
                            if(num>31){
                                System.out.println("siguiente mes carnal nmms");
                            }
                        
    
    }
}
