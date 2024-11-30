class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            if(s.length()==0 ||s.length()==1){
                return false;
            }else if(ch == '(' || ch =='{' || ch == '['){
                st.push(ch);
            }else if(ch == ')'){
                if(!st.isEmpty() && st.peek().equals('(')){
                    st.pop();
                }
                else{
                    return false;
                }
            }else if(ch == '}'){
                if(!st.isEmpty() && st.peek() =='{'){
                    st.pop();
                }
                else{
                    return false;
                }
            }else if(ch == ']'){
                if(!st.isEmpty() && st.peek() =='['){
                    st.pop();
                }
                else{
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}