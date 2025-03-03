package chapter07;

public class SelectionSort {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
        System.out.println(java.util.Arrays.toString(list));
        selectionSort(list);
        System.out.println(java.util.Arrays.toString(list));
    }

    /**
     * The method for sorting the numbers.
     */
    public static void selectionSort(double[] list) {
        for (int i = 0; i < list.length; i++) {
            //  Find the minimum in the list[i...list.length-1]
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            //  Swap list[i] with list[currentMinIndex] if necessary.
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }

        }
    }
}
