class Solution {
    public int[] searchRange(int[] nums, int target) {
        // If the array is empty, return [-1, -1]
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        int p1 = -1; // Start position
        int p2 = -1; // End position
        int[] arr = new int[2];

        // Find the first occurrence of target
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                p1 = i;
                break;
            }
        }

        // Find the last occurrence of target
        for (int j = nums.length - 1; j >= 0; j--) {
            if (nums[j] == target) {
                p2 = j;
                break;
            }
        }

        // If target is found, set p1 and p2 in the result array
        if (p1 != -1 && p2 != -1) {
            arr[0] = p1;
            arr[1] = p2;
        } else {
            arr[0] = -1;
            arr[1] = -1;
        }

        return arr;
    }
}
