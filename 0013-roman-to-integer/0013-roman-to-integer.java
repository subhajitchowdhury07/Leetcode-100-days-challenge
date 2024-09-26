class Solution {
    public int romanToInt(String s) {
        // Map Roman numerals to integer values
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            // Get the integer value for the current Roman numeral
            int currentVal = value(s.charAt(i));

            // If the current numeral is less than the next one, subtract it (like IV, IX)
            if (i < s.length() - 1 && currentVal < value(s.charAt(i + 1))) {
                sum -= currentVal;
            } else {
                sum += currentVal;
            }
        }
        return sum;
    }

    // Method to map Roman numeral characters to their integer values
    private int value(char ch) {
        switch (ch) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;  // Default case in case an invalid character is passed
        }
    }
}
