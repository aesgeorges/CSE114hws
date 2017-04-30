// Alexandre Erich Sébastien Georges
//111079942
// CSE 144.02 - L10

import java.util.Scanner;

public class Collatz {
  public static int howManyCollatzIterations(int n) {
    int temp;
      if ((n % 2) == 0) {
        temp = n / 2;
      } else {
        temp = (3 * n) + 1;
      }
      return temp;
    }
}
