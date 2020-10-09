public class Problem2 {

    // Do not change signature (function name, parameters)
    public static void bubbleSort(int[] data) {
        // Add your solution
        boolean isNotSorted = true;
        int length = data.length;
        for (int i = 0; i < length && isNotSorted; i++) {
            isNotSorted = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    swapInteger(data, j);
                    isNotSorted = true;
                }
            }
        }
    }

    public static void swapInteger(int[] data, int j) {
        int placeHolder = data[j];
        data[j] = data[j + 1];
        data[j + 1] = placeHolder;
    }
}