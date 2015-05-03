/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg10;

/**
 *
 * @author Alejandro
 */
public class Euler10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sum = 2;
        for(int i = 3; i < 2000000; i++){
            
        }
        
        int i = 3;
        while(i < 2000000){
            if(isPrime(i) == true){
                sum = sum + i;
                System.out.println(sum);
            }
            i = i + 2;
           
        }
    }
    
    public static boolean isPrime(int x){
        
        for(int i =2; i*i <= x ; i++){
            if(x%i == 0)
                return false;
        }
        
        return true;
    }
}
