import java.util.Scanner;

public class Payroll {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Employee\'s name : ");
    String name = input.nextLine();
    System.out.print("Number of hours worked : ");
    int hours = input.nextInt();
    System.out.print("Hourly pay rate : ");
    double hourly = input.nextDouble();
    double gross = hours * hourly;
    System.out.println("Gross income is " + gross);
    System.out.print("Federal tax withholding : ");
    double federal = (gross * input.nextInt()) / 100;
    System.out.print("State tax withholding: ");
    double state = (gross * input.nextInt()) / 100;
    double net = gross - federal - state;
    System.out.print("net income is " + net);
    }
  }
