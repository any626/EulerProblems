import java.math.BigInteger;

/**
 * 2^(15) = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * 	What is the sum of the digits of the number 2^(1000)?
 * @author Alejandro
 *
 */


public class sumofdigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		String num;
		int value = 0;
		
		BigInteger number = new BigInteger("2");
		
		num = number.pow(1000).toString();
		System.out.println(num);
		
		int sum[] = new int[num.length()];
		
		for(int i = 0; i < sum.length; i++){
			sum[i] = Integer.parseInt(num.substring(i,i+1));
			
			value = value + sum[i];
			System.out.println(value);
		}
		
		System.out.println(value);
		

	}

}
