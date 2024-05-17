import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Type a, b, h: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int h = scan.nextInt();
        if (a <= b) {
            System.out.println("Impossible");
            System.exit(0);
        }
        int days = 0;
        int difference = 0;
        while (true) {
            difference += a;
            days++;
            if (difference >= h)
                break;
            difference -= b;
           
        }
        System.out.println(days);

        scan.close();
    }
}