import java.util.Scanner;

public class NumToChar { 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number between 0 and 127 : ");
		int number = input.nextInt();
		
		if (number > 0 && number < 127) {
			char ascii = (char)number;
			System.out.print(ascii);
		} else {
			System.out.print("INVALID INPUT");
		}
		
	}
}