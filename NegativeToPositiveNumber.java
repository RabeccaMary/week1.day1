package week1.day1.assignments;

public class NegativeToPositiveNumber {

	public static void main(String[] args) {
		int input = 10, input1 = 0;
		if (input < 0) {
			System.out.println("The number is a negative number");
			input1 = input - 2 * input;
		} 
		else if(input>0){
			System.out.println("The number is a Positive number");
			input1 = input - 2 * input;
		}
		else
			System.out.println("The number is neither positive nor negative");
		
		System.out.println("The number " + input + " is converted to " + input1);
	}

}
