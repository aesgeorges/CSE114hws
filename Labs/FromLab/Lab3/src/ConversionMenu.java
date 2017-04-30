import java.util.Scanner;


public class ConversionMenu {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to Unit Converter. Please select what your conversion");
		System.out.println("A - Pounds to Kilo \nB - Kilos to Pounds \nC - Kilometers to Miles \nD - Miles to Kilometers \nE - Exit"); 
		System.out.print("Your selection : ");
		String selection = input.next();
		
		double pounds;
		double kg;
		double km;
		double miles;
		
		if (selection.equals("A")) {
			System.out.print("Mass in pounds : ");
			pounds = input.nextDouble();
			kg = pounds / 2.2046;
			System.out.print("You have " + kg + " kg");
		}
		if (selection.equals("B")) {
			System.out.print("Mass in kilos : ");
			kg = input.nextDouble();
			pounds = kg * 2.2046;
			System.out.print("You have " + pounds + " pounds");
		}
		if (selection.equals("C")) {
			System.out.print("Distance in kilometers : ");
			km = input.nextDouble();
			miles = km * 0.621;
			System.out.print("You have " + miles + " miles");
		}
		if (selection.equals("D")) {
			System.out.print("Distance in miles : ");
			miles = input.nextDouble();
			km = miles / 0.621;
			System.out.print("You have " + km + " kilometers");
		}
		if (selection.equals("E")) {
			System.out.println("Bye!");
		}
	}
}