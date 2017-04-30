import java.util.Scanner;

public class Divisible56 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		System.out.print("Enter an integer : ");
		int number = input.nextInt();
		boolean isIt = true;
		
		if (number % 5 == 0 && number % 6 == 0) {
			isIt = true;
			System.out.println("Is " + number + " divisible by 5 and 6? " + isIt);
		} else {
			isIt = false;
			System.out.println("Is " + number + " divisible by 5 and 6? " + isIt);
		}
		if (number % 5 == 0 || number % 6 == 0) {
			isIt = true;
			System.out.println("Is " + number + " divisible by 5 or 6? " + isIt);
			if (number % 5 == 0) {
				System.out.println(" (In this case, divisible by 5.)");
			} else if (number % 6 == 0) {
				System.out.println(" (In this case, divisible by 6.)");
			}
		} else {
			isIt = false;
			System.out.println("Is " + number + " divisible by 5 and 6? " + isIt);
		}
		if (number % 5 == 0 && number % 6 != 0) {
			isIt = true;
			System.out.println("Is " + number + " divisible by 5 and not by 6? " + isIt);
		}
		if (number % 6 == 0 && number % 5 != 0) {
			isIt = true;
			System.out.println("Is " + number + " divisible by 5 and not by 6? " + isIt);
		}
	}
}