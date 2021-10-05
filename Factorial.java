package week1.day1.classroom;

public class Factorial {
	/*
	 * Goal: Find the Factorial of a given number
	 * 
	 * input: 5 output: 5*4*3*2*1 = 120
	 * 
	 */

	public static void main(String[] args) {
		// Declare your input as 5
		int input = 10;
		// Declare an integer variable fact as 1
		int fact = 1;
		// Iterate from 1 to your input (tip: using loop concept)
		for (int i = 1; i <= input; i++) {
			fact = fact * i;
			System.out.println(fact);
		}
		// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to
		// the 'fact' variable)
		System.out.println("Factorial is " + fact);

		// End of loop
		// Print factorial (fact)
	}
}
