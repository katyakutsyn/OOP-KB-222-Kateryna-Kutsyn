public class Task10 {
    public static void main(String[] args) {
        int[] nums = {1,2,3,7,1,9,7,2};
        System.out.println(max(nums)); 
    }

    public static int max(int[] array) {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}