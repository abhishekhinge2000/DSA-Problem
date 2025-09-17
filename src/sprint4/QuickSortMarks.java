package sprint4;

public class QuickSortMarks { // Quick Sort function
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array and get the pivot index
            int pivotIndex = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // Partition function using first element as pivot
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[low]; // first element as pivot
        int i = low + 1;
        int j = high;

        while (i <= j) {
            // Move i to the right until an element greater than pivot is found
            while (i <= high && arr[i] <= pivot) {
                i++;
            }
            // Move j to the left until an element less than pivot is found
            while (arr[j] > pivot) {
                j--;
            }

            // Swap elements at i and j if needed
            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Swap pivot with element at j
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j; // New pivot position
    }

    //main method to test the sorting
    public static void main(String[] args){
        int[] studentMarks = {78, 92, 45, 89, 76, 99, 55, 68};

        quickSort(studentMarks, 0, studentMarks.length - 1);

        //Print the sorted Marks
        System.out.println("Sorted Marks");
        for(int mark : studentMarks){
            System.out.println(mark + " ");
        }
    }
}

