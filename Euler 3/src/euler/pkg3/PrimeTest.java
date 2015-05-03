/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg3;

/**
 *
 * @author Alejandro
 */
public class PrimeTest {

    private long number;
    
    public PrimeTest(long x){
        number = x;
    }
    
    public boolean test(){
     
        long i = 2;
        while(i < number /2){
            if(number % i == 0)
                return false;
            i++;
        }
        return true;
    }
            
        
}
