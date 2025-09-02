package sprint2;

public class InsertionSort {

    public static void insertionSort(int[] array) {
        // Outer loop starts from the second element since the first is considered sorted
        int totalComparisons = 0;
        for (int i = 1; i < array.length; i++) {
            // Store the value to be inserted
            int key = array[i];
            int j = i - 1;
            int comparisons = 0;

            // Inner loop shifts elements greater than key to the right
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
                comparisons++;
            }
            System.out.println("Pass: " + i + " - " + "Comparisons: " + comparisons);
            totalComparisons += comparisons;
            // Insert key into its correct position
            array[j + 1] = key;
        }
        System.out.println("Total Comparisons: " + totalComparisons);
    }
    // The below code is only for comparing insertion sort with selection sort
    public static void selectionSort(int[] array) {
        int totalComparisons = 0;

        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            int comparisons = 0;

            for (int j = i + 1; j < array.length; j++) {
                comparisons++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap if needed
            if (minIndex != i) {
                int temp = array[i];
                array[i] = array[minIndex];
                array[minIndex] = temp;
            }

            System.out.println("Pass: " + (i + 1) + " - Comparisons: " + comparisons);
            totalComparisons += comparisons;
        }

        System.out.println("Total Comparisons: " + totalComparisons);
    }

    public static void main(String[] args) {
        int[] ages = {64, 12, 22, 25, 11, 50, 90};
        insertionSort(ages);
//        selectionSort(ages);
        for(int i=0; i<ages.length;i++)
            System.out.println(ages[i]);
    }
}
