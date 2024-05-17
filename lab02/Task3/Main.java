package Task3;
import Point.Point;

public class Main {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(3, 0);
        Point C = new Point(0, 4);

        Triangle triangle = new Triangle(A, B, C);
        
        System.out.println("Area of triangle: " + triangle.area());
        System.out.println("Triangle's centroid: " + triangle.centroid());
    }
}