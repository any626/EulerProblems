/**
 * If the numbers 1 to 5 are written out in words: one, two, three, four, five,
 * then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.
 * 
 * If all the numbers from 1 to 1000 (one thousand) inclusive were written out
 * in words, how many letters would be used?
 * 
 * 
 * NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and
 * forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20
 * letters. The use of "and" when writing out numbers is in compliance with
 * British usage.
 * 
 * @author Alejandro
 * 
 */

/**
 * Catogorize the numbers in sections that are repeatable, then it is easy to
 * add up the sums.
 * 
 * @author Alejandro
 * 
 */
public class seventeen {

	static int ones = 36;
	static int tens = 70;
	static int twenties = 96;
	static int thirties = 96;
	static int forties = 86;
	static int fifties = 86;
	static int sixties = 86;
	static int seventies = 106;
	static int eighties = 96;
	static int nineties = 96;

	static int oneToNN = 854;
	static int oneH = 2151;
	static int twoH = 2151;
	static int threeH = 2351;
	static int fourH = 2251;
	static int fiveH = 2251;
	static int sixH = 2151;
	static int sevenH = 2351;
	static int eightH = 2351;
	static int nineH = 2251;
	static int thousand = 11;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(oneToNN + 3 *oneH + 3*threeH + 3 * fourH+ thousand);

	}

}
