public class Task11 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,7,8,2,10};
        System.out.println("Sum is " + sum(nums));
    }

    public static int sum(int[] array) {
        int sum = 0; 
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
            else {
                continue;
            }
        }
        return sum;
    }

}