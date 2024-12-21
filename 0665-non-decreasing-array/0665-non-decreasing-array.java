class Solution {
    public boolean checkPossibility(int[] nums) {
        int count = 0;  // To count the number of decreasing pairs
        
        for (int i = 0; i < nums.length - 1; i++) {
            // Check if there's a violation of non-decreasing order
            if (nums[i] > nums[i + 1]) {
                count++;
                
                // If there is more than one violation, we can't fix it with one change
                if (count > 1) {
                    return false;
                }
                
                // Check if we can modify nums[i] or nums[i + 1]
                // Modify nums[i] if possible
                if (i > 0 && nums[i - 1] > nums[i + 1]) {
                    // If modifying nums[i] doesn't help, try modifying nums[i + 1]
                    nums[i + 1] = nums[i];
                }
            }
        }
        
        // If there are 0 or 1 decreasing pairs, it's possible to fix the array
        return true;
    }
}
