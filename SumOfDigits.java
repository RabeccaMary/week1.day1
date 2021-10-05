package week1.day1.classroom;

public class SumOfDigits {
	public static void main(String[] args) {
		int input = 123;
		int sum = 0;
		while(input>0) {
			int reminder=input%10;
			int quotient = input/10;
			System.out.println(reminder);
			System.out.println(quotient);
			sum = sum+reminder;
			System.out.println(sum );
			input = quotient;
		}
		System.out.println("Sum of thr digits is " +sum);
	}
}
