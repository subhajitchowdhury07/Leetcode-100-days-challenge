class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder sb = new StringBuilder("");
       StringBuilder st = new StringBuilder("");

       if(s.length()==0 ||s.length()==1){
        return true;
       }
        
       for(int i=0; i<s.length();i++){
        if( Character.isLetterOrDigit(s.charAt(i))){
            sb.append(Character.toLowerCase(s.charAt(i)));
            st.append(Character.toLowerCase(s.charAt(i)));
            // st.append(s.charAt(i));
            // st.insert(0,s.charAt(i));

        }

       }
       st.reverse();
       if(!sb.toString().equals(st.toString())){
        return false;
       }
        return true;
    }
}