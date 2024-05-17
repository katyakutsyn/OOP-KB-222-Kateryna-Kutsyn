public class Task14 {
    public static void main(String[] args) {
        int[] array = {1,3,2,7,4};
        cycleSwapByOne(array);

        System.out.println();

        int shift = 3;
        cycleSwap(array, shift);
    }
    
    public static void cycleSwapByOne(int[] array) {
        int lastElem = array[array.length - 1];
        for (int i = array.length - 1; i > 0; i--) {
            array[i] = array[i - 1];
        }
        array[0] = lastElem;

        printArray(array);
    }

    public static void cycleSwap(int[] array, int shift1) {
        int shift = shift1-1;
        for (int j = 0; j < shift; j++) {
            int lastElem = array[array.length - 1];
            for (int i = array.length - 1; i > 0; i--)
                array[i] = array[i - 1];
            array[0] = lastElem;
        }

        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
