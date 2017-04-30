// Alexandre Erich Sébastien Georges
// 111079942
// CSE 114.02 - L10

class MyPoint {
  private double x;
  private double y;
  public MyPoint() {
    x = 0;
    y = 0;
  }
  public MyPoint(double newX, double newY) {
    x = newX;
    y = newY;
  }
  public double getX() {
    return x;
  }
  public double getY() {
    return y;
  }
  public double distance(MyPoint point) {
    double distance = 0;
    distance = Math.sqrt(Math.pow((point.x - x), 2) + Math.pow((point.y - y), 2));
    return distance;
  }
  public double distance(double newX, double newY) {
    double distance = 0;
    distance = Math.sqrt(Math.pow((newX - x), 2) + Math.pow((newY - y), 2));
    return distance;
  }
}

/* public class TestMyPoint {
  public static void main(String[] args) {
    MyPoint point1 = new MyPoint();
    MyPoint point2 = new MyPoint(10, 30.5);
    double d = point1.distance(point2);
    System.out.print("The distance is of : " + d);
  }
} */
