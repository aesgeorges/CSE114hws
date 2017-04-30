// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10
import java.util.Scanner;

public class RunLengthEncoding {
  public static String encode(String message, char delimiter) {
    String encoded = "";
    int count = 1;
    for (int i = 0; i < message.length(); i++) {
      if (message.charAt(i) >= 65 && message.charAt(i) <= 90) {
        while ((i + 1) < message.length() && message.charAt(i) == message.charAt(i + 1)) {
          count++;
          i++;
        }
        if (count > 3) {
          encoded += delimiter;
          encoded += message.charAt(i);
          encoded += count;
          count = 1;
        } else {
          for (int j = 0; j < count; j++) {
            encoded += message.charAt(i);
          }
          count = 1;
        }
      } else {
        encoded += message.charAt(i);
      }
    }
    return encoded;
  }
}
