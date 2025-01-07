class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] out = new int[2];
        out[0] = -1;
        out[1] = -1;
        
        // Binary search for the first occurrence of the target
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (left < nums.length && nums[left] == target) {
            out[0] = left;
        } else {
            return out;  // If the first occurrence is not found, no need to proceed
        }

        // Reset the variables for the second binary search
        left = 0;
        right = nums.length - 1;
        
        // Binary search for the last occurrence of the target
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= 0 && nums[right] == target) {
            out[1] = right;
        }

        return out;
    }
}
