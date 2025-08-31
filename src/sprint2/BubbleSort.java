package sprint2;
public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        System.out.println("Pass | Comparisons | Swaps | Array after pass");
        System.out.println("-".repeat(60));

        for (int i = 0; i < n - 1; i++) {
            int swaps = 0;
            int comparisons = 0;

            for (int j = 0; j < n - 1 - i; j++) {
                comparisons++;
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swaps++;
                }
            }

            StringBuilder arrStr = new StringBuilder("[");
            for (int j = 0; j < arr.length; j++) {
                arrStr.append(arr[j]);
                if (j < arr.length - 1) {
                    arrStr.append(", ");
                }
            }
            arrStr.append("]");

            System.out.printf("%d    | %11d | %5d | %s%n", (i + 1), comparisons, swaps, arrStr.toString());

            if (swaps == 0) break; // Optimization: Stop if no swaps were made
        }
    }
    public static void main(String[] args) {
        int[] rollNumbers = {18, 16, 20, 15, 19, 17, 21, 14, 22, 13};
        bubbleSort(rollNumbers);
    }
}
