/**
 * Given an integer array nums and an integer k,
 * return true if nums has a continuous subarray of size
 * at least two whose elements sum up to a multiple of k, or false otherwise.
 * An integer x is a multiple of k if there exists an integer n such that x = n * k.
 * 0 is always a multiple of k.
 */

package prefixSum;

import java.util.HashSet;
import java.util.Set;

public class ContinuousSubArrSum {
    public boolean checkSubarraySum(int[] nums, int k) {

        int n = nums.length;
        int[] sum = new int[n + 1];
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }

        for (int i = 2; i <= n; i++) {
            set.add(sum[i - 2] % k);
            if (set.contains(sum[i] % k)) {
                return true;
            }
        }

        return false;
    }
}
