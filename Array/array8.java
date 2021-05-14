//find Largest sum contiguous Subarray [V. IMP]
//Using Kadane's algorithm

public class array8 {
    public void maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = 0;

        for(int i=0; i<nums.length; i++) {
            currSum += nums[i];
            if(currSum > maxSum) {
                maxSum = currSum;
            }
            if(currSum < 0) {
                currSum = 0;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        array8 a = new array8();

        int[] nums = {5, -4, -2, 6, -1};
        a.maxSubArray(nums);

        //System.out.println(a.maxSubArray());
    }
}
