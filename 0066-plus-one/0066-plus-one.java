import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
        StringBuilder sb = new StringBuilder();

        // Convert the digits array to a String
        for (int digit : digits) {
            sb.append(digit);
        }

        // Parse the string as a BigInteger and increment by 1
        BigInteger number = new BigInteger(sb.toString());
        number = number.add(BigInteger.ONE);

        // Convert the incremented number back to a String
        String str = number.toString();

        // Create an array with the correct size to hold the result
        int[] arr = new int[str.length()];

        // Populate the array with each digit in the String
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i) - '0';
        }

        return arr;
    }
}
