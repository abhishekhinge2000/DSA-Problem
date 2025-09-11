// Exercise 2: Sort a 2D matrix row-wise using Selection Sort
// Examples: Input: matrix[][] = { {9, 4, 7},
//                                 {6, 2, 8} }
//           Output: matrix[][] = { {4, 7, 9),
//                                  {2, 6, 8}}

package sprint2;

public class SelectionSort2DEx2 {
    public static void main(String[] args) {
        int[][] matrix = {
                {9, 4, 7},
                {6, 2, 8}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Sort each row using selection sort
        sortRows(matrix);

        System.out.println("\nMatrix After Row-wise Sorting:");
        printMatrix(matrix);
    }

    // Method to apply selection sort on each row
    public static void sortRows(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {   // for each row
            selectionSort(matrix[i]);               // sort the row
        }
    }

    // Selection sort for a single row
    public static void selectionSort(int[] row) {
        int n = row.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (row[j] < row[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum with the first element
            int temp = row[i];
            row[i] = row[minIndex];
            row[minIndex] = temp;
        }
    }

    // Utility method to print a 2D matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}