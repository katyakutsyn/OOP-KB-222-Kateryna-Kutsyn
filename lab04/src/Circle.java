
class Circle extends Figure {
    Point center;
    double radius;

    public Circle(Point center, double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("Radius must be greater than zero.");
        }
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public Point centroid() {
        return center;
    }

    @Override
    public String toString() {
        return "Circle[" + center + " Radius: " + radius + "]";
    }
}
