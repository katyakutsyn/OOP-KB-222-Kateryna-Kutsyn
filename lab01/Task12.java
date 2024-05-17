import java.util.Arrays;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {1, -1, 0, 4, 6, 10, 15, 25};
        boolean[] boolArray = getSumCheckArray(array);
        System.out.println("Result: " + Arrays.toString(boolArray));
    }

    public static boolean[] getSumCheckArray(int[] array) {
        boolean[] boolArray = new boolean[array.length];
        boolArray[0] = false;
        boolArray[1] = false;
        for (int i = 2; i < array.length; i++) {
            if (array[i-1] + array[i-2] == array[i])
                boolArray[i] = true;
            else
                boolArray[i] = false;
        }
        return boolArray;
    }
    
}