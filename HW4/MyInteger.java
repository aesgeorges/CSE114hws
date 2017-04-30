// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10
// import java.util.Scanner;

class MyInteger {
  private int value;
  public MyInteger(int x) {
    value = x;
  }
  public int getValue() {
    return  value;
  }
  public boolean isEven() {
    boolean even = false;
    if (value % 2 == 0) {
      even = true;
    }
    return even;
  }
  public boolean isOdd() {
    boolean odd = false;
    if (value % 2 != 0) {
      odd = true;
    }
    return odd;
  }
  public boolean isPrime() {
    boolean prime = true;
    if (value > 1) {
      for (int i = 2; i < value; i++) {
        if (value % i == 0) {
          prime = false;
          break;
        }
      }
    }
    return prime;
  }
  public static boolean isEven(int x) {
    boolean even = false;
    if (x % 2 == 0) {
      even = true;
    }
    return even;
  }
  public static boolean isOdd(int x) {
    boolean odd = false;
    if (x % 2 != 0) {
      odd = true;
    }
    return odd;
  }
  public static boolean isPrime(int x) {
    boolean prime = true;
    if (x > 1) {
      for (int i = 2; i < x; i++) {
        if (x % i == 0) {
          prime = false;
          break;
        }
      }
    }
    return prime;
  }
  public static boolean isEven(MyInteger integer) {
    boolean even = false;
    if (integer.getValue() % 2 == 0) {
      even = true;
    }
    return even;
  }
  public static boolean isOdd(MyInteger integer) {
    boolean odd = false;
    if (integer.getValue() % 2 != 0) {
      odd = true;
    }
    return odd;
  }
  public static boolean isPrime(MyInteger integer) {
    boolean prime = true;
    if (integer.getValue() > 1) {
      for (int i = 2; i < integer.getValue(); i++) {
        if (integer.getValue() % i == 0) {
          prime = false;
          break;
        }
      }
    }
    return prime;
  }
  public static int parseInt(String a) {
    boolean negative = false;
    int parsed = 0;
    if (a.charAt(0) == '-') {
      negative = true;
      for (int i = a.length() - 1, j = 0; i > 0; i--, j++) {
        parsed += (a.charAt(i) - '0') * Math.pow(10, j);
      }
    } else {
      for (int i = a.length() - 1, j = 0; i > -1; i--, j++) {
        parsed += (a.charAt(i) - '0') * Math.pow(10, j);
      }
    }
    if (negative == true) {
      parsed *= -1;
    }
    return parsed;
  }
}

/* public class TestMyInteger {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer : ");
    int number = input.nextInt();
    MyInteger integer = new MyInteger(number);
    System.out.println("getValue() : " + integer.getValue());
    System.out.println("isEven() : " + integer.isEven());
    System.out.println("isOdd() : " + integer.isOdd());
    System.out.println("isPrime() : " + integer.isPrime());
    System.out.println("isEven(int) : " + MyInteger.isEven(number));
    System.out.println("isOdd(int) : " + MyInteger.isOdd(number));
    System.out.println("isPrime(int) : " + MyInteger.isPrime(number));
    System.out.println("isEven(MyInteger) : " + MyInteger.isEven(integer));
    System.out.println("isOdd(MyInteger) : " + MyInteger.isOdd(integer));
    System.out.println("isPrime(MyInteger) : " + MyInteger.isPrime(integer));
    System.out.println("Enter a String of numbers : ");
    String num = input.next();
    System.out.println("parseInt(String) : " + MyInteger.parseInt(num));
  }
} */
