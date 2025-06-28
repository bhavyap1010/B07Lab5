package lab5;

public class Circle {
  Point center;
  double radius;

  public Circle(Point center, double radius) {
    this.center = center;
    this.radius = radius;
  }

  public double computeArea() {
    return Math.PI * radius * radius;
  }

  public double computePerimeter() {
    return 2 * Math.PI * radius;
  }
}
