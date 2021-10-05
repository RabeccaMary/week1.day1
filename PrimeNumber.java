package week1.day1.assignments;

public class PrimeNumber {
	/*
	 * Goal: To find whether a number is a Prime number or not
	 * 
	 * input: 13 output: 13 is a Prime Number
	 * 
	 * What are my learnings from this code? 1) 2) 3)
	 * 
	 */

	public static void main(String[] args) {
		// Declare an int Input and assign a value 13
		int input = 131;
		System.out.println("Input is " + input);
		// Declare a boolean variable flag as false
		boolean flag = false;
		// Iterate from 2 to half of the input
		for (int i = 2; i <= (input / 2); i++) {
			// Divide the input with each for loop variable and check the remainder
			int reminder = input % i;
			//System.out.println("Reminder is " + reminder);
			// Set the flag as true when there is no remainder
			if (reminder == 0) {
				flag = true;
				break;
			}
		}
//Check the flag (Provide a condition)
		if (flag == false)
			System.out.println("Prime number");
		else
			System.out.println("Not a Prime number");

		// Print 'Prime' when the condition matches

		// Print 'Not a Prime' when the condition doesn't match

	}
}
