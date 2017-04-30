import java.util.Scanner;

public class Sort3 {
  public static void main (String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Please input 3 numbers (integers) : ");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

      if (num1 > num2) {
        if (num1 > num3) {
          if (num2 > num3) {
            System.out.print(num1 + " " + num2 + " " + num3);
          } else {
            System.out.print(num1 + " " + num3 + " " + num2);
          }
      } else  if (num3 > num2) {
        System.out.print(num3 + " " + num1 + " " + num2);
      }
    } else if (num2 > num3) {
      if (num1 > num3) {
        System.out.print(num2 + " " + num1 + " " + num3);
      } else {
        System.out.print(num2 + " " + num3 + " " + num1);
      }
    } else {
      System.out.print(num3 + " " + num2 + " " + num1);
    }
  }
}
