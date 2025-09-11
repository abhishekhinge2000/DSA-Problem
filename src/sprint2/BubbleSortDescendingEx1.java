package sprint2;

public class BubbleSortDescendingEx1 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 9, 6, 7, 4};

        System.out.println("Original Array:");
        printArray(arr);

        bubbleSortDescending(arr);

        System.out.println("\nSorted Array in Descending Order:");
        printArray(arr);
    }

    // Bubble Sort (Descending with optimization)
    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        boolean swapped;

        // Outer loop for passes
        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            // Inner loop for comparisons
            for (int j = 0; j < n - 1 - i; j++) {
                // Swap if next element is greater (for descending order)
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            // Optimization: stop if no swaps occurred
            if (!swapped) {
                break;
            }
        }
    }

    // Utility method to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
