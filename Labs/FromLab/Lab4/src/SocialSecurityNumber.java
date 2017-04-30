import java.util.Scanner;

public class SocialSecurityNumber {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    boolean isValid = true;
    System.out.print("Please enter a valid SSN with the format DDD-DD-DDDD (where D is an integer) : ");
    String ssn = input.next();

    if (ssn.length() != 11) {
      isValid = false;
    }
    for (int i = 0; i<ssn.length(); i++) {
      if (i==3 || i==6) {
        if (ssn.charAt(i) != '-') {
          isValid = false;
        }
      }
    }
    if (isValid == true) {
      System.out.print("Your SSN is valid.");
    }
    else {
      System.out.print("Invalid SSN.");
    }
  }
}
