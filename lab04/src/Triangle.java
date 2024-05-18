
class Triangle extends Figure {
    Point A, B, C;

    public Triangle(Point A, Point B, Point C) {
        this.A = A;
        this.B = B;
        this.C = C;
        if (isDegenerate()) {
            throw new IllegalArgumentException("Triangle is degenerate.");
        }
    }

    private boolean isDegenerate() {
        double area = Math.abs((A.x*(B.y - C.y) + B.x*(C.y - A.y) + C.x*(A.y - B.y)) / 2.0);
        return area == 0;
    }

    @Override
    public double area() {
        return Math.abs((A.x*(B.y - C.y) + B.x*(C.y - A.y) + C.x*(A.y - B.y)) / 2.0);
    }

    @Override
    public Point centroid() {
        double centroidX = (A.x + B.x + C.x) / 3;
        double centroidY = (A.y + B.y + C.y) / 3;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Triangle[A" + A + " B" + B + " C" + C + "]";
    }
}
