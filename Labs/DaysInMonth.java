import java.util.Scanner;

public class DaysInMonth {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please enter the month number : ");
    int months = input.nextInt();
    System.out.print("Please enter the year : ");
    int year = input.nextInt();

    if (months > 0 && months < 13) {
      if (months == 1) {
        System.out.print("January " + year + " has 31 days.");
      }
      if (months == 2) {
        if (((year % 4) == 0 && (year % 100) != 0) || (year % 400) == 0) {
          System.out.print("February " + year + " has 29 days.");
        } else {
          System.out.print("February " + year + " has 28 days.");
        }
      }
      if (months == 3) {
        System.out.print("March " + year + " has 31 days.");
      }
      if (months == 4) {
        System.out.print("April " + year + " has 30 days.");
      }
      if (months == 5) {
        System.out.print("May " + year + " has 31 days.");
      }
      if (months == 6) {
        System.out.print("June " + year + " has 30 days.");
      }
      if (months == 7) {
        System.out.print("July " + year + " has 31 days.");
      }
      if (months == 8) {
        System.out.print("August " + year + " has 31 days.");
      }
      if (months == 9) {
        System.out.print("September " + year + " has 30 days.");
      }
      if (months == 10) {
        System.out.print("October " + year + " has 31 days.");
      }
      if (months ==11) {
        System.out.print("November " + year + " has 30 days.");
      }
      if (months ==  12) {
        System.out.print("December " + year + " has 31 days.");
      }
    } else {
      System.out.print("Please enter a correct month. Months are between 1 and 12.");
    }

    }
  }
