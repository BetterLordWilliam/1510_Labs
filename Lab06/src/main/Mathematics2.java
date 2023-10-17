package main;

import java.util.Random;

/**
 * 
 * 
 * 
 */
public class Mathematics2 {

	public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;
	private final Random rand = new Random();

	/**
	 * Gets the square area
	 * 
	 * @param d
	 * @return
	 */
	public double getSquareArea(double d) {
		// TODO Auto-generated method stub
		return Math.pow(d, 2);
	}

	/**
	 * Addition method.
	 * 
	 * @param d
	 * @return
	 */
	public double add(double d, double e) {
		// TODO Auto-generated method stub
		return (double) d + e;
	}

	/**
	 * Multiplication method.
	 * 
	 * @param d
	 * @return
	 */
	public double multiply(double d, double e) {
		// TODO Auto-generated method stub
		return (double) d * e;
	}

	/**
	 * Substraction method.
	 * 
	 * @param d
	 * @param e
	 * @return
	 */
	public double subtract(double d, double e) {
		// TODO Auto-generated method stub
		return (double) d - e;
	}

	/**
	 * Division method.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public double divide(int i, int j) {
		// TODO Auto-generated method stub
		double toReturn = 0.0;
		if (j != 0)
			toReturn = (double) i / j;
		return toReturn;
	}

	/**
	 * Absolute value method.
	 * 
	 * @param i
	 * @return
	 */
	public int absoluteValue(int i) {
		// TODO Auto-generated method stub
		return Math.abs(i);
	}

	/**
	 * Get random number method.
	 * 
	 * @return
	 */
	public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
		// TODO Auto-generated method stub
		int num = rand.nextInt(10, 21);
		if (num == 15)
			num = getRandomNumberBetweenTenAndTwentyButNotFifteen();
		return num;
	}

	/**
	 * Convert feet to kilometers method.
	 * 
	 * @param d
	 * @return
	 */
	public double convertFeetToKilometres(double d) {
		// TODO Auto-generated method stub
		return (double) FOOT_TO_KILOMETRE_RATIO * d;
	}
	
	/**
	 * Sum of products method.
	 * 
	 * @param i
	 * @param j
	 * @return
	 */
	public int sumOfProducts(int i, int j) {
		// TODO Auto-generated method stub
		int product = 0;
		int iters = 1;
		if (i > 0) {
			while (iters <= i/j) {
				product += j*iters;
				iters += 1;
			}
		} else {
			while (iters <= Math.abs(i/j)) {
				product += -j*iters;
				iters += 1;
			}
		}
		return product;
	}

}
