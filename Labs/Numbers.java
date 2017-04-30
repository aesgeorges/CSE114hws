import java.util.Scanner;

public class Numbers {
  public static void main(String[] args) {
    Scanner stdin = new Scanner(System.in);
    int[] list = new int[10];


    for (int i = 0; i < list.length; i++) {
      System.out.print("Enter 10 integers : ");
      int number = stdin.nextInt();
      for (int j = 0; j < list.length; j++) {
        if (number != list[j]) {
          list[i] = number;
        } else {
          i = j;
          break;
        }
      }
   }
    for(int i = 0; i < list.length; i++){
      System.out.print(list[i] + " ");
    }
  }
}
