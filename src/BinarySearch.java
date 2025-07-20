//Binary Search

public class BinarySearch {
     public static int binarySearch(int[] arr, int key){
         int low = 0, high = arr.length - 1;

         while (low <= high){
             int mid = (low + high) / 2;

             if(arr[mid] == key){
                 return mid;
             }
             else if(arr[mid] < key){
                 low = mid + 1;
             }
             else{
                 high = mid - 1;
             }
         }
         return - 1;
     }
     public static void main(String [] args){
         int[] arr = {1, 3, 5, 7, 9, 11};
         int index = binarySearch(arr, 11);

         System.out.println("Found at index: " + index);
     }

}
