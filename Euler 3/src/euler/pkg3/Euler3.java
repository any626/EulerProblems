
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg3;

/**
 *
 * @author Alejandro
 */
public class Euler3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 0;
        long x;
        long number = 600851475143l;
                              
        for (long i = 2; i < number/2 ; i++){
            if(number % i == 0){
                x = (number / i);
                if(x < i)
                    break;
                
                PrimeTest prime = new PrimeTest(x);
                PrimeTest primeTwo = new PrimeTest(i);
                
                if(prime.test() == true || primeTwo.test() == true){
                    System.out.println(x + " " + prime.test() + " and " + i);
                }
         }
        }
    }
}
