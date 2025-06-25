package lab5;

public class Square {
    // 'p' represents the bottom-left corner of the square, which can later be used to find 
    // other coordinates using 'side' if required
    Point p;
    double side;

    public Square(Point p, double side) {
        this.p = p;
        this.side = side;
    }

    public double perimeter() {
        return 4 * side;
    }

    public double area() {
        return side * side;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } 
        if (getClass() != obj.getClass()) {
            return false;
        }

        Square other = (Square) obj;
        // point comparison
        if (p == null) {
            if (other.p != null) {
                return false;
            }
        }
        else if (!p.equals(other.p)) {
            return false;
        }

        // side comparison
        if (side != other.side) {
            return false;
        }

        return true;
    }

}