package chapter07;

public class BinarySearch {
    /**
     * Main method.
     */
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        System.out.println(binarySearch(list, 2));  // Returns 0.
        System.out.println(binarySearch(list, 11)); // Returns 4.
        System.out.println(binarySearch(list, 12)); // Returns -6.
        System.out.println(binarySearch(list, 1));  // Returns -1.
        System.out.println(binarySearch(list, 3));  // Returns -2.
    }

    /**
     * Use binary search to find the key in the list.
     */
    public static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;

        while (high >= low) {
            int mid = (low + high) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -low - 1;
    }
}
