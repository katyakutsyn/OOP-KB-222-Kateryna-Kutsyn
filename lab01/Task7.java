import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -1;
        System.out.print("Type a nums: ");
        while (true) {
            int num = scan.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Max num is " + max);

        scan.close();
    }
}