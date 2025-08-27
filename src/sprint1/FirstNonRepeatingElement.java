package sprint1;

public class FirstNonRepeatingElement {
    public static int findFirstNonRepeating(int[] arr){
       int n = arr.length;

       for(int i = 0; i < n ; i++){
           boolean isRepeated = false;
           for(int j= 0; j <n; j++){
             if( i != j && arr[i] == arr[j]){
                 isRepeated = true;
                 break;
             }
           }
           if(! isRepeated){
               return arr[i];
           }
       }
       return -1;
    }
    public static void main(String[] args){
        int[] arr1 = {9, 4, 9, 6, 4, 8};
        System.out.println("FirstNonRepeatingElement: " + findFirstNonRepeating(arr1));

        int[] arr2 = {1, 1, 1, 2, 2, 3, 3};
        System.out.println("FirstNonRepeatingElement: " +findFirstNonRepeating(arr2));
    }
}
