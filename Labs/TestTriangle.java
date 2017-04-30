public class TestTriangle {
  public static void main(String[] args) {
    Triangle triangle1 = new Triangle(1, 1.5, 1);
    System.out.print(triangle1.toString());
  }
}

class Triangle {
  private double side1;
  private double side2;
  private double side3;
  public Triangle() {
    side1 = 1.0;
    side2 = 1.0;
    side3 = 1.0;
  }
  public Triangle(double x, double y, double z) {
    side1 = x;
    side2 = y;
    side3 = z;
  }
  public double getSide1() {
    return side1;
  }
  public double getSide2() {
    return side2;
  }
  public double getSide3() {
    return side3;
  }
  public double getArea() {
    double perimeter = side1 + side2 + side3;
    double area = Math.sqrt(perimeter*(perimeter - side1)*(perimeter - side2)*(perimeter - side3));
    return area;
  }
  public double getPerimeter() {
    double perimeter = side1 + side2 + side3;
    return perimeter;
  }
  public String toString() {
    String description = "Sides are : " + side1 + ", " + side2 + ", " + side3 +
    ", " + ", the perimeter is : " + this.getPerimeter() + ", the area is " + this.getArea();
    return description;
  }
}
