class Solution {
    public int reverse(int x) {
        int temp = 0;

        while (x != 0) {
            int z = x % 10; // Get the last digit
            x /= 10;        // Remove the last digit

            // Check for overflow before multiplying by 10
            if (temp > Integer.MAX_VALUE / 10 || (temp == Integer.MAX_VALUE / 10 && z > 7)) {
                return 0; // Overflow, return 0
            }
            if (temp < Integer.MIN_VALUE / 10 || (temp == Integer.MIN_VALUE / 10 && z < -8)) {
                return 0; // Underflow, return 0
            }

            temp = temp * 10 + z; // Build the reversed number
        }

        return temp;
    }
}
