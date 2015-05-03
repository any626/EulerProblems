/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg1;

/**
 *
 * @author Alejandro
 */
public class Euler1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 3;
        
        int y = 5;
        
        int sumOne = 0;
        
        int sumTwo = 0;
        
        int[] multThree = new int[334];
        
        int[] multFive = new int[200];
        
        
        for(int i = 1; i < multThree.length; i++){
            multThree[i-1] = i*x;
        }
        for(int i = 1; i < multFive.length; i ++){
            if(y*i % 3 != 0){
                multFive[i-1] = i*y;
            }
        }
        for(int i = 0; i< multThree.length;i++){
            sumOne = sumOne + multThree[i];
        }
        for(int i = 0; i< multFive.length; i++){
            sumTwo = sumTwo + multFive[i];
        }
        int sum = sumOne + sumTwo;
        System.out.println("Threes = " + sumOne);
        System.out.println("Fives = " + sumTwo);
        System.out.println("Sum = " + sum);
    }
}
