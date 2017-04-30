// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10

class Complex {
  private double real;
  private double imaginary;
  public Complex(double a, double b) {
    real = a;
    imaginary = b;
  }
  public Complex(double a) {
    real = a;
    imaginary = 0;
  }
  public Complex() {
    real = 0;
    imaginary = 0;
  }
  public double getRealPart() {
    return real;
  }
  public double getImaginaryPart() {
    return imaginary;
  }
  public Complex add(Complex newComplex) {
    double a = this.getRealPart() + newComplex.getRealPart();
    double b = this.getImaginaryPart() + newComplex.getImaginaryPart();
    Complex sum = new Complex(a, b);
    return sum;
  }
  public Complex substract(Complex newComplex) {
    double a = this.getRealPart() - newComplex.getRealPart();
    double b = this.getImaginaryPart() - newComplex.getImaginaryPart();
    Complex sub = new Complex(a, b);
    return sub;
  }
  public Complex multiply(Complex newComplex) {
    double a = (this.getRealPart()  * newComplex.getRealPart()) - (this.getImaginaryPart() * newComplex.getImaginaryPart());
    double b = (this.getImaginaryPart() * newComplex.getRealPart()) + (this.getRealPart()  * newComplex.getImaginaryPart());
    Complex mul = new Complex(a, b);
    return mul;
  }
  public Complex divide(Complex newComplex) {
    double a = (this.getRealPart()*newComplex.getRealPart() + this.getImaginaryPart()*newComplex.getImaginaryPart()) /
     (Math.pow(newComplex.getRealPart(), 2) + Math.pow(newComplex.getImaginaryPart(), 2));
    double b = (this.getImaginaryPart()*newComplex.getRealPart() - this.getRealPart() *newComplex.getImaginaryPart()) /
     (Math.pow(newComplex.getRealPart(), 2) + Math.pow(newComplex.getImaginaryPart(), 2));
     Complex div = new Complex(a, b);
     return div;
  }
  public String toString() {
    String complex = "";
    if (real == 0) {
      complex += imaginary + "i";
    } else if (imaginary == 0) {
      complex += real;
    } else {
      complex += real + " + " + imaginary + "i";
    }
    return complex;
  }
}

//import java.util.Scanner;
/*public class TestComplex {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Complex1 : ");
    System.out.print("Enter the real part : ");
    double a = input.nextDouble();
    System.out.print("Enter the imaginary part : ");
    double b = input.nextDouble();
    Complex complex1 = new Complex(a, b);
    System.out.print("Complex2 : ");
    System.out.print("Enter the real part: ");
    double x = input.nextDouble();
    System.out.print("Enter the imaginary part : ");
    double y = input.nextDouble();
    Complex complex2 = new Complex(x, y);
    Complex sum = complex1.add(complex2);
    System.out.println("Their sum is : " + sum.toString());
    Complex sub = complex1.substract(complex2);
    System.out.println("Their difference is : " + sub.toString());
    Complex mult = complex1.multiply(complex2);
    System.out.println("Their product is : " + mult.toString());
    Complex div = complex1.divide(complex2);
    System.out.println("Their quotient is : "+ div.toString());
  }
} */
