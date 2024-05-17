package Task2;
import Point.Point;


public class Segment {
    private Point entryPoint;
    private Point endPoint;


    public Segment(Point entryPoint, Point endPoint) {
        if (entryPoint.equals(endPoint)) {
            System.out.println("Points can't be the same!");
            System.exit(1);
        }
        this.entryPoint = new Point(entryPoint);
        this.endPoint = new Point(endPoint);
    }

    public double length() {
        double x1 = this.entryPoint.getX();
        double y1 = this.entryPoint.getY();
        double x2 = this.endPoint.getX();
        double y2 = this.endPoint.getY();

        double lenght = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return lenght;
    }

    public Point middle() {
        double x1 = this.entryPoint.getX();
        double y1 = this.entryPoint.getY();
        double x2 = this.endPoint.getX();
        double y2 = this.endPoint.getY();

        double middleX = (x1 + x2) / 2;
        double middleY = (y1 + y2) / 2;
        return new Point(middleX, middleY);
    }

    public Point intersection(Segment another) {
        double x1 = this.entryPoint.getX();
        double y1 = this.entryPoint.getY();
        double x2 = this.endPoint.getX();
        double y2 = this.endPoint.getY();

        double x3 = another.entryPoint.getX();
        double y3 = another.entryPoint.getY();
        double x4 = another.endPoint.getX();
        double y4 = another.endPoint.getY();

        double intersectionX = (((x1*y2 - y1*x2)*(x3 - x4)) - ((x1 - x2)*(x3*y4 - y3*x4))) 
            / ((x1 - x2)*(y3 - y4) - (y1 - y2)*(x3 - x4));
        double intersectionY = (((x1*y2 - y1*x2)*(y3 - y4)) - ((y1 - y2)*(x3*y4 - y3*x4)))
            / ((x1 - x2)*(y3 - y4) - (y1 - y2)*(x3 - x4));
        
        return new Point(intersectionX, intersectionY);

    }

}