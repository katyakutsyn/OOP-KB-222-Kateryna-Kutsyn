public class Segment {
    Point start, end;

    public Segment(Point start, Point end) {
        if (start.equals(end)) {
            throw new IllegalArgumentException("Segment cannot have the same start and end point.");
        }
        this.start = start;
        this.end = end;
    }

    public double length() {
        return Math.sqrt(Math.pow(end.x + start.x, 2) + Math.pow(end.y + start.y, 2));
    }

    public Point middle() {
        return new Point((start.x + end.x) / 2, (start.y + end.y) / 2);
    }

    public Point intersection(Segment another) {
        Line line1 = new Line((end.y - start.y) / (end.x - start.x), start.y - (start.x * (end.y - start.y) / (end.x - start.x)));
        Line line2 = new Line((another.end.y - another.start.y) / 
        (another.end.x - another.start.x), another.start.y - (another.start.x * (another.end.y - another.start.y) / 
        (another.end.x - another.start.x)));
        return line1.intersection(line2);
    }
}
