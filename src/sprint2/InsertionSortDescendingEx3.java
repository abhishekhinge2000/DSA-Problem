// Exercise 3: Debug Insertion Sort (Descending Order)

// public static int[] insertionSortDesc(int[] arr){
// for (int i = 1; i < arr.length; i++) {
// int key = arr[i];
// int j=i+1;
// while (j>= 0 && arr[j] > key){
// arr[j+1]=a[j];
// j--;
// }
//  arr[j + 1] = key;
//  }
//  return arr;
//  }

package sprint2;

public class InsertionSortDescendingEx3  {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 6, 2, 8};

        System.out.println("Original Array:");
        printArray(arr);

        insertionSortDesc(arr);

        System.out.println("\nSorted Array in Descending Order:");
        printArray(arr);
    }

    public static int[] insertionSortDesc(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // Shift elements that are smaller than key
            while (j >= 0 && arr[j] < key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    // Utility to print array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
