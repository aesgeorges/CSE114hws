import java.util.Scanner;

public class Converter {
    Scanner input = new Scanner(System.in);
    double pounds;
    double kilos;
    double km;
    double m;

    public static double poundsToKilos(double pounds) {

    }
    public static double kilosToPounds(double kilos) {

    }
    public static double kmToM(double km) {

    }
    public static double mToKm(double m) {

    }

    public static void main (String[] args) {
      System.out.println("Menu - Select Your Conversion.");
      System.out.println("A - Pounds To Kilos \n B - Kilos To Pounds \n C - Kilometers to Miles \n D - Miles To Kilometers \n E - Exit");
      char selection = int.next();
      switch (selection) {
        case 'A' : poundsToKilos();
        case 'B' : kilosToPounds();
        case 'C' : kmToM();
        case 'D' : mToKm();
        case 'E' : break;
      }
    }
}
