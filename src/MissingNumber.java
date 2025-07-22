// Find the missing number in an array of size n containing from  0 to n

public class MissingNumber {
    public static int findMissingNumber(int[] nums){
        int n = nums.length;
        int totalSum = n * (n + 1) / 2;
        int actualSum = 0;

        for(int num : nums){
            actualSum += num;
        }
        return totalSum - actualSum;
    }
    public static void main(String[] args){
        int[] nums = {0, 2, 3};
        System.out.println(findMissingNumber(nums));
    }
}
