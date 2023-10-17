package main;

/**
 * A collection of mathematical tests.
 * 
 * @author Will Otterbein
 * @version 2023-1
 */
public class Mathematics {

    /** Pi constant. */
    public static final double PI = 3.14159;

    /**
     * Method to get the area of a circle.
     * 
     * @param d radius
     * @return area
     */
    public double getCircleArea(double d) {
        return Math.PI * Math.pow(d, 2);
    }

    /**
     * Sum some ints.
     * 
     * @param n n
     * @return int
     */
    public int sumOfInts(int n) {
        int sum = 0;
        
        for (int i = 0; i <= n; i += 1) {
            sum += i;
        }
        
        return sum;
    }

    /**
     * Checks if a number is positive.
     * 
     * @param i i
     * @return boolean
     */
    public boolean isPositive(int i) {
        return i > 0;
    }

    /**
     * Checks if a number is even.
     * 
     * @param i i
     * @return boolean
     */
    public boolean isEven(int i) {
        return (i % 2) == 0;
    }

    /**
     * Sums some even ints.
     * 
     * @param n the end number
     * @return sum
     */
    public int sumOfEvens(int n) {
        int sum = 0;
        if (n >= 0) {
            sum = n / 2 * (n / 2 + 1);
        } else if (n < 1) {
            sum = -(-n / 2 * (-n / 2 + 1));
        }
        return sum;
    }
}
