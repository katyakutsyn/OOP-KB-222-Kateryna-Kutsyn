import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int sum = 0;
        int count = 0;
        
        System.out.print("Type a nums: ");
        while (true) {
            int num = scan.nextInt();
            if (num == 0) {
                break;
            }
            sum += num;
            count++;
        }
        
        double average = (double) sum / count;
        System.out.println("Result: " + average);
        

        scan.close();
    }
}