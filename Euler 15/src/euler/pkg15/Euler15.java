/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg15;

/**
 *
 * @author Alejandro
 */
public class Euler15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //need to allow for big numbers, use BigInteger
        long nFact = 1l;
        long kFact = 1l;
        long nkFact = 1l;
        long n = 40l;
        long k = 20l;
        for (long i = n; i >n-k; i --){
            nFact *= i;
        }
        for(long i = k; i>0; i--){
            nFact/=i;
        }
//        for(long i = n-k; i > 0; i--){
//            nkFact*=i;
//        }
        System.out.println(nFact);
    }
}
