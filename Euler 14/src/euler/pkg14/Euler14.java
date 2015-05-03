/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg14;

/**
 *
 * @author Alejandro
 */
public class Euler14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int chain;
        double sequence;
        int max = 0;
        double currentMax = 0;
        for(double i = 2; i < 1000000; i++){
            chain = 0;
            sequence = i;
            while(sequence !=1){
                if(sequence % 2 == 0){
                    sequence = sequence/2;
                    chain++;
                }else{
                    sequence = 3*sequence+1;
                    chain++;
                }
            }
            
            if(chain >= max){
                max = chain;
                currentMax = i;
                
            System.out.println("Number: " + currentMax + " Chain Length: " + max);
            }            
        }
    }
}
