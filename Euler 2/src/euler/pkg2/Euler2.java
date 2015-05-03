/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg2;

/**
 *
 * @author Alejandro
 */
public class Euler2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x;
        int x1 = 1;
        int x2 = 2;
        int sum = 2;
        
        for(int i = 0; i >= 0; i++){
            x = x1 + x2;
            x1 = x2;
            x2 = x;
            if(x % 2 == 0){
                sum = sum + x;
                System.out.println(sum);
            }
            if(x>4000000){
                break;
            }
        }
    }
}
