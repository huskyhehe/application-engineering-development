package binary;

import java.util.Arrays;

public class FirstLastPosition {
    public int[] searchRange(int[] nums, int target) {

        int leftIndex = search(nums, target);
        if (leftIndex >= nums.length || nums[leftIndex] != target) {
            return new int[]{-1, -1};
        }

        int rightIndex = search(nums, target + 1);
        return new int[]{leftIndex, rightIndex - 1};
    }

    private int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right){
            int mid = (right - left) / 2 + left;
            if (nums[mid] >= target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return left;
    }
}
