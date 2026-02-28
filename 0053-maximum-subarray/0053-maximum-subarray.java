class Solution {
    public int maxSubArray(int[] nums) {
        // Initialize with the first element
        int currentSum = nums[0];
        int maxSoFar = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            // Decision: Should we extend the existing subarray or start a new one?
            // currentSum = max(current_element, currentSum + current_element)
            currentSum = Math.max(nums[i], currentSum + nums[i]);

            // Update the global maximum if the current subarray is the best we've seen
            maxSoFar = Math.max(maxSoFar, currentSum);
        }

        return maxSoFar;
    }
}