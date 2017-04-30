import java.util.Scanner;

public class Converter {
	public static Scanner input = new Scanner(System.in);
    public static double pounds;
    public static double kilos;
    public static double km;
    public static double m;
    public static double result;

    public static double poundsToKilos(double pounds) {
    	double kg = pounds / 2.2;
    	return kg;
    }
    public static double kilosToPounds(double kilos) {
    	double lb = kilos * 2.2;
    	return lb;
    }
    public static double kmToM(double km) {
    	double mile = km / 1.61;
    	return mile;
    }
    public static double mToKm(double m) {
    	double kilom = m * 1.61;
    	return kilom;
    }

    public static void main (String[] args) {
      System.out.println("Menu - Select Your Conversion.");
      System.out.println("A - Pounds To Kilos \n B - Kilos To Pounds \n C - Kilometers to Miles \n D - Miles To Kilometers \n E - Exit");
      System.out.print("Your selection : ");
      char selection = input.next().charAt(0);

      switch (selection) {
        case 'A' : 
        	System.out.print("Enter the amount of pounds : "); 
        	pounds = input.nextDouble();
        	result = (Math.round(poundsToKilos(pounds) * 100)) / 100.0;
        	System.out.print(pounds + " pounds is " + result + " kilos.");
        	break;
        case 'B' : 
        	System.out.print("Enter the amount of Kilos : ");
        	kilos = input.nextDouble();
        	result = Math.round(kilosToPounds(kilos) * 100) / 100.0;
        	System.out.print(kilos + " kilos is " + result + " pounds.");
        	break;
        case 'C' : 
        	System.out.print("Enter the amount of kilometers : ");
        	km = input.nextDouble();
        	result = Math.round(kmToM(km) * 100) / 100.0;
        	System.out.print(km + " kilometers is " + result + " miles.");
        	break;
        case 'D' : 
        	System.out.print("Enter the amount of miles : ");
        	m = input.nextDouble();
        	result = Math.round(mToKm(m) * 100) / 100.0;
        	System.out.print(m + " miles is " + result + " kilometers.");
        	break;
        case 'E' : System.out.print("Bye!");
        	break;
      }
    }
}
