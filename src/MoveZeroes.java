//Moves the zeroes to endMove all zeroes in an array to the end
//while maintaining the order of other elements.

import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
      int index = 0;

      for(int num : nums){
          if(num != 0){
              nums[index++] = num;
          }
      }
      while(index < nums.length){
          nums[index++] = 0;
      }
    }
    public static void main(String[] args){
        int[] nums = {0, 1, 4, 12, 0, 13};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
