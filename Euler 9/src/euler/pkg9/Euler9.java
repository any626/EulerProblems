/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg9;

/**
 *
 * @author Alejandro
 */
public class Euler9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        oneThousand:
        for(double a = 1; true; a++){
            for(double b = a+1;true; b++){
                double c = Math.sqrt(a*a + b*b);
                double sum = a + b + c;
                if(a + b > 1000)
                    break;
                if(c % 1 ==0){
                    if(a + b + c > 1000)
                        break;
                    System.out.println(a + " " + b + " " + c + " " + sum);
                    if(a + b + c == 1000){
                        long product = (long)(a*b*c);
                        System.out.println(product);
                        System.exit(0);
                    }
                }
            }                       
           
        }
        
    }
}
