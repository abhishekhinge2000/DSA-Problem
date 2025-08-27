package sprint1;

public class FirstRepeatingElement {
    public static int findFirstRepeatingIndex(int[] arr){
        int n = arr.length;

        for(int i = 0; i < n ; i++){
            for(int j = i + 1 ; j < n ; j++){
                if(arr[i] == arr[j]){
                return i; // return first index where repeat is found
            }
        }
    }
    return -1; // no repeating element
}
public static void main(String[] args){
        int[] arr1 = {10, 7, 2, 4, 2, 7, 8};
        System.out.println("FirstRepeatingElement: " +findFirstRepeatingIndex(arr1));

        int[] arr2 = {10, 13, 16, 4, 7, 120, 4, 16, 10};
        System.out.println("FirstRepeatingElement: " +findFirstRepeatingIndex(arr2));
}
}
