package sprint1;
public class CountOnesUsingBinarySearch {
    public static int countOnes(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Check if mid is 1 and next is 0 or mid is the last index
            if (arr[mid] == 1) {
                if (mid == arr.length - 1 || arr[mid + 1] == 0) {
                    return mid + 1; // Number of 1s is index + 1
                } else {
                    left = mid + 1; // Move right to find the last 1
                }
            } else {
                right = mid - 1; // Move left to find the last 1
            }
        }

        return 0; // No 1s found
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 1, 0, 0, 0, 0};
        int[] arr2 = {1, 1, 1, 1, 1, 0, 0};
        int[] arr3 = {0, 0, 0, 0, 0, 0, 0};

        System.out.println("Count of 1s in arr1: " + countOnes(arr1)); // Output: 3
        System.out.println("Count of 1s in arr2: " + countOnes(arr2)); // Output: 5
        System.out.println("Count of 1s in arr3: " + countOnes(arr3)); // Output: 0
    }
}
