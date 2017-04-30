import java.util.Scanner;

public class Animals {
  public static double priceCat;
  public static int dogs;
  public static int cats;
  public static double budget;

  public static double pricePerCat(double budget, int dogs, int cats) {
    priceCat = budget / (cats + (3 * dogs));
    return priceCat;
  }

  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter your budget : ");
    budget = input.nextDouble();
    System.out.print("Enter the number of dogs : ");
    dogs = input.nextInt();
    System.out.print("Enter the number of cats : ");
    cats = input.nextInt();

    double result = pricePerCat(budget, dogs, cats);
    System.out.println("Mary can spend " + result + " dollars on each of her cats.");
  }
}
