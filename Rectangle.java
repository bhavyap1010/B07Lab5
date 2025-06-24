package lab5;

public class Rectangle {
    Point p;
    double width;
    double height;

    public Rectangle(Point p, double width, double height) {
        this.p = p;
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public boolean isSquare() {
        return width == height;
    }
}
