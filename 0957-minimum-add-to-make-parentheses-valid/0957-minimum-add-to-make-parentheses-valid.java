class Solution {
    public int minAddToMakeValid(String s) {
        int cc=0;  // to track a balance of (
        int count =0; // to track a blance of )

        for(int i=0; i<s.length();i++){
            if(s.charAt(i)== '('){
                cc++;
            }else if (s.charAt(i)== ')'){
                // count++;
                if(cc >0){
                    cc--;
                }else{
                    count++;
                }
            }
        }

        return cc+count;
    }
}