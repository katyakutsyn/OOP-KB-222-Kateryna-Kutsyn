package Task2;
import Point.Point;

public class Main {
    public static void main(String[] args) {
        Segment segment = new Segment(new Point(2, 1), new Point(6, 4));

        System.out.println("Lenght of the segment: " + segment.length());

        System.out.println("Middle point of the segment: " + segment.middle());

        Segment anotherSegment = new Segment(new Point(1, 1), new Point(2, 3));
        System.out.println("Intersection point of the segment: " + segment.intersection(anotherSegment));
    }
}