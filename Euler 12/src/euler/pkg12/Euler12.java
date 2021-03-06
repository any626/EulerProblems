/*
 * The sequence of triangle numbers is generated by adding the natural numbers. 
 * So the 7th triangle number would be 1 + 2 + 3 + 4 + 5 + 6 + 7 = 28. 
 * The first ten terms would be:
 *
 * 1, 3, 6, 10, 15, 21, 28, 36, 45, 55, ...
 *
 * Let us list the factors of the first seven triangle numbers:
 *
 * 1: 1
 * 3: 1,3
 * 6: 1,2,3,6
 * 10: 1,2,5,10
 * 15: 1,3,5,15
 * 21: 1,3,7,21
 * 28: 1,2,4,7,14,28
 * We can see that 28 is the first triangle number to have over five divisors.
 *
 * What is the value of the first triangle number
 * to have over five hundred divisors?
 */
package euler.pkg12;

/**
 * This method takes too long, should have used number theory. 
 * Phi function(sigma function).
 * @author Alejandro
 */
public class Euler12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long triNum = 0;
//        for(long i = 1; true; i++){
//            triNum = triNum + i;
//            if(factors(triNum) == true){
//                System.out.println(triNum);
//                System.exit(0);
//            }
//                
//        }
        long i = 1;
        while(true){
            triNum = (i*(i+1))/2;
            if(factors(triNum)==true){
                System.out.println(triNum);
                System.exit(0);
            }
            i++;
        }
    }
    
    public static boolean factors(long x){
        long counter = 1;
        
        for(int i = 1; i <= x/2; i ++){
            
            if(x % i == 0){
                counter ++;
            }
            if(counter > 500){
                return true;
            }
        }
//        System.out.println(x + " " + counter);
        return false;
    }
}
