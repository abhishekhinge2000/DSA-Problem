//Find indexes of two numbers in an array that add up to a target
import java.util.*;

public class TwoSum {
    public static int[] FindTwoSum(int[] nums, int target){

        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];

            if(map.containsKey(complement)){
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {};  // no solution
    }

    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(FindTwoSum(nums, target)));
    }

}
