import java.util.Scanner;

public class RandomInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int sum = 0;
    int value;
    double avg;
    int negative = 0;
    int positive = 0;
    System.out.println("You will be entering random integers, enter 0 to stop the process. ");

    for (int i = 1; i < 100; i++) {
      System.out.print("Enter an integer : ");
      value = input.nextInt();
      sum = sum + value;
      avg = (double)sum / (i - 1);
      if (value > 0) {
        positive++;
      } else if (value < 0){
        negative++;
      }
      if (value == 0) {
        System.out.print("The total is " + sum + ". The average is " + avg + ". There is " + positive + " positive numbers and " +
        negative + " negative numbers.");
        break;
      }
    }
  }
}
