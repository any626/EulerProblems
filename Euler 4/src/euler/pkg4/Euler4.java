/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package euler.pkg4;

/**
 *
 * @author Alejandro
 */
public class Euler4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int biggestPalindrome = 0;
        
        for(int i = 100; i <1000; i++){
            
            for(int j = 100; j < 1000; j++){
                
                int x = i*j;
                
                if(palindromeTest(x) == true){
                    if(x > biggestPalindrome){
                        biggestPalindrome = x;
                    }  
                }                            
                
            }
                
        }
        
        System.out.println(biggestPalindrome);
        
    }
    
    public static boolean palindromeTest(int number){
        int x;
        if(((number % 1000000)/100000)> 0){
            x = 1;            
        }else{
            x = 10;
        }
        
        if(((number % 10)) == ((number % (1000000/x))/(100000/x))){
            
            if(((number % 100)/10) == ((number % (100000/x))/(10000/x))){
                
                if(((number % 1000)/100) == ((number % (10000/x)/(1000/x)))){
                    return true;
               }
            }
        }         
        return false;        
    }
}
