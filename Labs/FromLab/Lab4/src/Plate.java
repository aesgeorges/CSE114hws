import java.util.Scanner;

public class Plate {
  public static void main(String[] args) {
    for (int i = 0; i < 3; i++) {
      char letter = (char)((int)'A' + Math.random() * ((int)'Z' - (int)'A' + 1));

      System.out.print(letter);
    }
    for (int s = 0; s < 4; s++) {
      int number = (int)(Math.random()*10);
      System.out.print(number);
    }
  }
}
