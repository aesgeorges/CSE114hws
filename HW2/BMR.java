import java.util.Scanner;

public class BMR {
  public static Scanner input = new Scanner(System.in);
  public static double weight, height;
  public static int old;
  public static char gender;

  public static double bmr(double pounds, double inches, int age, char gender) {
    double pounds_kg = pounds * 0.453592;
    double inches_cm = inches * 2.54;
    double k = 0.0;
    switch (gender) {
      case 'M' :
        k = (10 * pounds_kg) + (6.25 * inches_cm) - (5 * age) + 5;
      case 'F' :
        k = (10 * pounds_kg) + (6.25 * inches_cm) - (5* age) - 161;
      default :
        System.out.print("WRONG GENDER INPUT");
        break;
    }
    return k;
  }

  public static void main(String[] args) {
    System.out.print("Enter your weight in pounds : ");
    weight = input.nextDouble();
    System.out.print("Enter your height in inches : ");
    height = input.nextDouble();
    System.out.print("Enter your age : ");
    old = input.nextInt();
    System.out.print("What gender do you identify as ? (M or F) : ");
    gender = input.next().charAt(0);
    double bmr_result = bmr(weight, height, old, gender);
    System.out.print("Your BMR is " + bmr_result);
  }
}
