package Task1;

public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        Point intersection = line1.intersection(line2);
        if (intersection != null) {
            System.out.println(line1.intersection(line2));
        } 
        else {
            System.out.println("The lines are coincident or parallel");
        }
    }
    
}
