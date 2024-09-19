class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int missingNum = -1;
        
        // Loop through 0 to n to find the missing number
        for (int i = 0; i <= n; i++) {
            boolean found = false;
            for (int j = 0; j < n; j++) {
                if (nums[j] == i) {
                    found = true;
                    break; // Stop checking once we find i
                }
            }
            // If i is not found, it's the missing number
            if (!found) {
                missingNum = i;
                break;
            }
        }

        return missingNum;
    }
}
