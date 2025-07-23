// Find the missing number in an array of size n containing from  0 to n

public class MissingNumber {
    public static int findMissingNumber(int[] nums){
        int n = nums.length;  // step: length of array(which is n)
        int totalSum = n * (n + 1) / 2; // step2: Expected sum from 0 to n
        int actualSum = 0;

        for(int num : nums){
            actualSum += num; // step3: calculate the sum of given number
        }
        return totalSum - actualSum; // step4: subtract to find missing number
    }
    public static void main(String[] args){
        int[] nums = {0, 2, 3};
        System.out.println(findMissingNumber(nums));
    }
}
