// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10

import java.util.Scanner;

public class MissingLetters {
  public static String GetMissingLetters(String testString) {
    String missing = "";
    int
    testString = testString.toLowerCase();
    int count = 0;
    char min = testString.charAt(0), max = testString.charAt(0);
    for (int i = 0; i < testString.length(); i++) {
      if (testString.charAt(i) > max) {
        max = testString.charAt(i);
      }
      if (testString.charAt(i) < min) {
        min = testString.charAt(i);
      }
    }
    for (int j = 1; (min + j) < max; j++) {
      missing += (char)(min + j);
      for (int i = 0; i < testString.length(); i++) {
        if ((min + j) == testString.charAt(i)) {
          count++;
        } else {

          break;
        }
      }
        }
        return missing;
      }
  }
