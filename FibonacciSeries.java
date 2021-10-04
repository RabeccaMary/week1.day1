package week1.day1.assignments;

public class FibonacciSeries {
	/*
	 * Goal: To find Fibonacci Series for a given range
	 * 
	 * input(range): 8 output: 0, 1, 1, 2, 3, 5, 8, 13
	 * 
	 * What are my learnings from this code? 
	 * 1) usage of for loop 
	 * 
	 */

	public static void main(String[] args) {
		// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
		int range = 8, firstNumber = 0, secNumber = 1, sum = 0;
		// Print first number
		System.out.println("The first number is " + firstNumber);
		System.out.println("The second number is " + secNumber);
		for (int i = 2; i < range; i++) {
			// add first and second number assign to sum
			sum = firstNumber + secNumber;
			// Assign second number to the first number
			firstNumber = secNumber;
			// Assign sum to the second number
			secNumber = sum;
			// print sum
			System.out.println("The following number is " + sum);
		}
	}
}
