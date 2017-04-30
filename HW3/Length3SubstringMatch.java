// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10

import java.util.Scanner;

public class Length3SubstringMatch {
  public static int stringMatch3(String a, String b) {
    int count = 0;
    String shortest = "";
    if (a.length() < b.length()) {
      shortest = a;
    } else {
      shortest = b;
    }
    for (int i = 0; i < (shortest.length() - 2); i++) {
      if (a.substring(i, i+3).equals(b.substring(i, i+3))) {
        count++;
      }
    }
    return count;
  }
}
