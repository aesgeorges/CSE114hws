// Alexandre Erich Sebastien Georges
// 111079942
// CSE 114.02 - L10

import java.util.Scanner;

public class BaseToBase {
  public static String base2base(String n, int b1, int b2) {
    String converted = "";
    int decimal = 0;
    int temp = 0;
    for (int i = n.length() - 1, j = 0; i > -1; i--, j++) {
      if (n.charAt(i) >= 10 && n.charAt(i) < 36) {
        decimal += ((int)(n.charAt(i) - 55) * Math.pow(b1, j));
      } else {
        decimal += ((int)(n.charAt(i)) - 48) * Math.pow(b1, j);
      }
    }
    while (decimal > 0) {
      temp = (decimal % b2);
      if (temp >= 10 && temp < 36) {
        converted = (char)(temp + 55) + converted;
      } else {
        converted = (char)(temp + 48) + converted;
      }
      decimal = decimal / b2;
    }
   return converted;
  }
}
