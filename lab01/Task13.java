import java.util.Arrays;

public class Task13 {
    public static void main(String[] args) {
        int[] nums = {18, 1, 3, 6, 7, -5};
        int[] result = removeLocalMaxima(nums);
        System.out.println("Result: " + Arrays.toString(result));
    }
    public static int[] removeLocalMaxima(int[] array) {
        boolean[] isLocalMaxima = new boolean[array.length];
        int count = 0;

        for (int i = 1; i < (array.length) - 1; i++) {
            if (array[i] > array[i+1] && array[i] > array[i-1]) {
                isLocalMaxima[i] = true;
                count++;
            }
        }
        if (array[0] > array[1]) {
            isLocalMaxima[0] = true;
            count++;
        }
        if (array[array.length-1] > array[array.length-2]) {
            isLocalMaxima[isLocalMaxima.length-1] = true;
            count++;
        }

        int[] result = new int[array.length - count];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (!isLocalMaxima[i]) 
                result[j++] = array[i];
        }

        return result;
    }
}