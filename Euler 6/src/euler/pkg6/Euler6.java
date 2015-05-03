/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg6;

/**
 *
 * @author Alejandro
 */
public class Euler6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sumOfSquares = 0;
        int sum = 0;
        int x = 0;
        for(int i = 0; i <= 100; i++){
            sumOfSquares = sumOfSquares + i*i;
            sum = sum + i ;
        }
        
        System.out.println(sum*sum - sumOfSquares);
    }
}
