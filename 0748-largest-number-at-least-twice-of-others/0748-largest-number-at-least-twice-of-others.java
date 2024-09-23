class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0; // If there's only one element, it's trivially the largest
        
        int maxIndex = 0; // Initialize max index to the first element

        // Find the index of the maximum element
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Check if the max element is at least twice all other elements
        for (int i = 0; i < nums.length; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1; // If the max element isn't at least twice another element, return -1
            }
        }

        return maxIndex; // Return the index of the dominant element
    }
}
