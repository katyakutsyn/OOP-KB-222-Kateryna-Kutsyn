
public class Main {
    public static void main(String[] args) {
        // Triangle
        Point A = new Point(0, 0);
        Point B = new Point(4, 0);
        Point C = new Point(2, 3);
        Triangle triangle = new Triangle(A, B, C);
        System.out.println(triangle);
        System.out.println("Area: " + triangle.area());
        System.out.println("Centroid: " + triangle.centroid());

        // Quadrilateral
        Point D = new Point(4, 4);
        Quadrilateral quadrilateral = new Quadrilateral(A, B, C, D);
        System.out.println(quadrilateral);
        System.out.println("Area: " + quadrilateral.area());
        System.out.println("Centroid: " + quadrilateral.centroid());

        //  Circle
        Point center = new Point(5, 5);
        Circle circle = new Circle(center, 3);
        System.out.println(circle);
        System.out.println("Area: " + circle.area());
        System.out.println("Centroid: " + circle.centroid());
    }
}
