public class Triangle {
    Point a, b, c;

    public Triangle(Point a, Point b, Point c) {
        if (isDegenerate(a, b, c)) {
            throw new IllegalArgumentException("The points do not form a valid triangle.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean isDegenerate(Point a, Point b, Point c) {
        double area = 0.5 * Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
        return area == 0;
    }

    public double area() {
        return 0.5 * Math.abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y));
    }

    public Point centroid() {
        double centroidX = (a.x + b.x + c.x) / 3;
        double centroidY = (a.y + b.y + c.y) / 3;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Triangle[" + a + ", " + b + ", " + c + "]";
    }
}

