import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Amount of strangers: ");
        int amountStrangers = scan.nextInt();
        while (amountStrangers <= 0) {
            System.out.print("Amount cant be 0 or negative. Try again: ");
            amountStrangers = scan.nextInt();
        }

        scan.nextLine();
        for (int i = 0; i < amountStrangers; i++) {
            System.out.println("\nWhat's a stranger name?");
            String name = scan.nextLine();
            System.out.println("\nHello, " + name);
        }
        
        scan.close();
    }
}