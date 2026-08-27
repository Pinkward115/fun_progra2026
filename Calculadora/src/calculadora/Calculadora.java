
package calculadora;

/**
 *
 * @author eloso
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int a1 = 10;
      int b2 = 8;
      float c1 = 1.1234f;
      float d2 = 3.1416f; 
      int result =a1 + b2;
      int result2 =b2 - a1;
      float result3 =c1 * d2;
      float result4 =d2 / c1;
        System.out.println("suma:"+result); 
        System.out.println("resta:"+result2);
        System.out.println("multiplicacion:"+result3);
        System.out.println("divicion"+result4);
    }
    
}
