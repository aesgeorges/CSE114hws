import java.util.Scanner; 

public class DaysInMonth {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Please enter the month number : ");
		int month = input.nextInt();
		System.out.print("Please enter the year : ");
		int year = input.nextInt();
		
		if ((year % 4) == 0 && (year % 100) != 0 || (year % 400) == 0 ) {
			if (month == 1) {
				System.out.println("January " + year + " has 31 days");
			}
			if (month == 3) {
				System.out.println("March " + year + " has 31 days");
			}
			if (month == 5) {
				System.out.println("May " + year + " has 31 days");
			}
			if (month == 7) {
				System.out.println("July " + year + " has 31 days");
			}
			if (month == 8) {
				System.out.println("August " + year + " has 31 days");
			}
			if (month == 10) {
				System.out.println("October "+ year + " has 31 days");
			}
			if (month == 12) {
				System.out.println("December " + year + " has 31 days");
			}
			if (month == 2) {
				System.out.println("February " + year + " has 29 days");
			}
		} else {
			if (month == 1) {
				System.out.println("January " + year + " has 31 days");
			}
			if (month == 3) {
				System.out.println("March " + year + " has 31 days");
			}
			if (month == 5) {
				System.out.println("May " + year + " has 31 days");
			}
			if (month == 7) {
				System.out.println("July " + year + " has 31 days");
			}
			if (month == 8) {
				System.out.println("August " + year + " has 31 days");
			}
			if (month == 10) {
				System.out.println("October "+ year + " has 31 days");
			}
			if (month == 12) {
				System.out.println("December " + year + " has 31 days");
			}
			if (month == 2) {
				System.out.println("February " + year + " has 28 days");
			}
		}
	}
}