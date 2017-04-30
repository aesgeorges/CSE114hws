import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a random integer : ");
		int number = input.nextInt();
		boolean isIt;
		
		if (number % 2 == 0) {
			isIt = true;
			System.out.print("Is " + number + " an even number? " + isIt);
		} else {
			isIt = false;
			System.out.print("Is " + number + " an even number? " + isIt + ". It\'s odd.");
		}
	}
}