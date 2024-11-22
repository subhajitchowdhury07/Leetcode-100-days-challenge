class Solution {
    public String reverseWords(String s) {
        Stack<Character> st = new Stack<>();
        // String arr[] = new String[s.length()];
        boolean isWord = false;
        StringBuilder sb = new StringBuilder("");
        for(int i=s.length()-1; i >=0; i--){
            char cc = s.charAt(i);

            if(cc != ' '){
            st.push(cc);
            isWord = true;
            }else if(isWord == true){
        while(st.size()>0){
            sb.append(st.pop());
        }

                sb.append(' '); 
                isWord = false; 
       }
    }

     while (!st.isEmpty()) {
            sb.append(st.pop());
        }

        return sb.toString().trim();
    }
}