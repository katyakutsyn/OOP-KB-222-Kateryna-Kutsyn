
class Quadrilateral extends Figure {
    Point A, B, C, D;

    public Quadrilateral(Point A, Point B, Point C, Point D) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        if (isDegenerate()) {
            throw new IllegalArgumentException("Quadrilateral is degenerate.");
        }
    }

    private boolean isDegenerate() {
        return area() == 0;
    }

    @Override
    public double area() {
        double area1 = Math.abs((A.x * B.y + B.x * C.y + C.x * A.y - A.y * B.x - B.y * C.x - C.y * A.x) / 2.0);
        double area2 = Math.abs((A.x * C.y + C.x * D.y + D.x * A.y - A.y * C.x - C.y * D.x - D.y * A.x) / 2.0);
        return area1 + area2;
    }

    @Override
    public Point centroid() {
        double centroidX = (A.x + B.x + C.x + D.x) / 4;
        double centroidY = (A.y + B.y + C.y + D.y) / 4;
        return new Point(centroidX, centroidY);
    }

    @Override
    public String toString() {
        return "Quadrilateral[A" + A + " B" + B + " C" + C + " D" + D + "]";
    }
}
