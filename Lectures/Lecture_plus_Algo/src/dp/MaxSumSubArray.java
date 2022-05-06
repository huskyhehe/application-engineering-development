package dp;

public class MaxSumSubArray {
    public int maxSubArray(int[] nums) {

        int maxSoFar = 0;
        int res = nums[0];

        for (int num : nums) {
            maxSoFar = Math.max(num, maxSoFar + num);
            res = Math.max(res, maxSoFar);
        }
        return res;
    }
}
