package Task3;
import Point.Point;

public class Triangle {
    private Point A;
    private Point B;
    private Point C;
    private Segment segmentAB;
    private Segment segmentBC;
    private Segment segmentAC;

    public Triangle(Point A, Point B, Point C) {
        this.A = new Point(A);
        this.B = new Point(B);
        this.C = new Point(C);
        this.segmentAB = new Segment(A, B);
        this.segmentBC = new Segment(B, C);
        this.segmentAC = new Segment(A, C);

        if (!isExistingTriangle()) {
            System.out.println("Invalid triangle.");
            System.exit(1);
        }
    }

    public boolean isExistingTriangle() {
        double area = area();
        return area > 0;
    }

    public double area() {
        // https://uk.wikipedia.org/wiki/Формула_Герона
        double halfPerimeter = (this.segmentAB.length() + this.segmentBC.length() + this.segmentAC.length()) / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - this.segmentAB.length()) 
                        * (halfPerimeter - this.segmentBC.length()) 
                        * (halfPerimeter - this.segmentAC.length()));
    }

    public Point centroid() {
        return new Point(((this.A.getX() + this.B.getX() + this.C.getX()) / 3),
                        ((this.A.getY() + this.B.getY() + this.C.getY()) / 3));
    }
}