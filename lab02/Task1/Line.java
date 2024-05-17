package Task1;

public class Line {
    private double k;
    private double b;


    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    public Point intersection(Line secondLine) {
        if (this.k == secondLine.k) {
            return null;
        }

        double x = (secondLine.b - this.b) / (this.k - secondLine.k);
        double y = this.k * x + this.b;
        return new Point(x, y);
    }
}