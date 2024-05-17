import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Money : ");
        int toPay = scan.nextInt();
        System.out.print("people: ");
        int amout = scan.nextInt();
        if (toPay <= 0 || amout <= 0) {
            System.exit(0);
        }

        double tip = (toPay / amout) + (toPay / amout)*0.1;
        System.out.println("Tip is " + tip);

        scan.close();
    }
}