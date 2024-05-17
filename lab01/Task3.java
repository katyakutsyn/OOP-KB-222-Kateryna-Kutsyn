import java.util.Scanner;

public class Task3 {
    private static final int password = 550022;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Password: ");
        int secretPassword = scan.nextInt();

        if (secretPassword == password) {
            System.out.println("Hello, Agent");
        }
        else {
            System.out.println("Access denied");
        }

        scan.close();
    }
}
