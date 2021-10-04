package week1.day1.assignments;

public class ArmstrongNumber {
	/*
	 * Goal: To find whether a number is an Armstrong number or not
	 * 
	 * inputs: 153 output: (1*1*1)+(5*5*5)+(3*3*3) = 153
	 * 
	 * Shortcuts: 1) Print : type: syso, followed by: ctrl + space + enter 2) To
	 * create a While loop, type 'while' followed by: ctrl + space + down arrow +
	 * enter 3) To create an 'if' condition: type 'if', followed by ctrl + space
	 * +down arrow + enter
	 * 
	 * What are my learnings from this code? 
	 * 1) Usage of While loop
	 * 2) Learned how to find an armstrong number
	 * 3) usage of if-else, difference between = and ==
	 * 
	 */

	public static void main(String[] args) {
		// Declare your input
		int input = 370;
		// Declare 3 more int variables as calculated, remainder, original (Tip:
		// Initialize calculated alone)
		int calculated = 0;
		int reminder, original;
		// Assign input into variable original
		original = input;
		// Use loop to calculate: use while loop to set condition until the number
		// greater than 0
		while (input > 0) {
			// Within loop: get the remainder when done by 10 (Tip: Use Mod operator)
			reminder = (input % 10);
			System.out.println("Reminder is : " + reminder);
			// Within loop: get the quotient when done by 10 (Tip: Assign the result to
			// input)
			input = (input / 10);
			System.out.println("Input is : " + input);
			// Within loop: Add calculated with the cube of remainder & assign it to
			// calculated
			calculated = calculated + (reminder * reminder * reminder);
			System.out.println("Calculated is : " + calculated);
		}
		// Check whether calculated and original are same
		if (calculated == original)
			// When it matches print it as Armstrong number

			System.out.println("The number is an armstrong number");
		else
			System.out.println("The number is not an armstrong number");
	}

}
