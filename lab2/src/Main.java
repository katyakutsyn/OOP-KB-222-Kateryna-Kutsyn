public class Main {
    public static void main(String[] args) {
        // Triangle
        Point p1 = new Point(0, 0);
        Point p2 = new Point(4, 0);
        Point p3 = new Point(2, 3);

        try {
            Triangle triangle = new Triangle(p1, p2, p3);
            System.out.println("Triangle: " + triangle);
            System.out.println("Area of the triangle: " + triangle.area());
            System.out.println("Centroid of the triangle: " + triangle.centroid());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        //  Line 
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);
        Point intersection = line1.intersection(line2);
        System.out.println("Intersection of lines: " + intersection);

        //  Segment
        Segment segment1 = new Segment(p1, p2);
        Segment segment2 = new Segment(new Point(0, 4), new Point(4, 0));
        System.out.println("Length of segment1: " + segment1.length());
        System.out.println("Middle of segment1: " + segment1.middle());
        Point segmentIntersection = segment1.intersection(segment2);
        System.out.println("Intersection of segments: " + segmentIntersection);
    }
}
