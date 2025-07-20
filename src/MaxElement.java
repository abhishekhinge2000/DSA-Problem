//Find the maximum element in an array

public class MaxElement {
  public static int findMax(int[] arr){
      int max = arr[0];

      for(int num : arr){
          if(num > max){
              max = num;
          }
      }
      return max;
  }
  public static void main(String[] args) {
      int[] arr = {1, 3, 8, 4, 7};
      System.out.print(findMax(arr));
  }
}
