/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg7;

/**
 *
 * @author Alejandro
 */
public class Euler7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int counter = 2;
        int isPrime = 0;
        for(int i = 2; true; i++){
            if((i % 2 == 0) || (i % 5 == 0) && (i > 5)){
                continue;
            }
            test:
            for(int j = 2; j*j <= i; j++){
                if(i%j == 0){
                    isPrime = 0;
                    break test;
                } else {
                    isPrime = 1;
                }
                
            }  
            if(isPrime == 1){
                counter++;
                if(counter > 10001)
                    break;
                
                System.out.println(i + " " + counter);}
        }
    }
}
