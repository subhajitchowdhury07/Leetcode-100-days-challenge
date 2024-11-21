import java.util.Stack;

class Solution {
    public String removeDuplicateLetters(String s) {
        int[] lastIndex = new int[26]; // Corrected array size

        // Record the last index of each character
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';
            lastIndex[idx] = i;
        }

        boolean[] present = new boolean[26]; // Track if a character is in the stack
        Stack<Character> st = new Stack<>();

        // Iterate through the string
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = ch - 'a';

            if (!present[idx]) {
                // Ensure lexicographical order and uniqueness
                 while(st.size()>0 && st.peek()>ch && lastIndex[(int)(st.peek()-'a')]>i){
                    present[(int)(st.peek()-'a')] = false;
                    st.pop();}

                st.push(ch);
                present[idx] = true;
            }
        }

        // Build the result string
         StringBuilder sb = new StringBuilder("");
        while(st.size()>0){
          sb.append(st.pop());
        }

        return sb.reverse().toString();
    }
}
