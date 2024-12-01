class Solution {
    public boolean isAnagram(String s, String t) {
        int[] frqS = new int[26];
        int[] frqT = new int[26];

        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            int idx = (int)(ch-'a');
            frqS[idx] =frqS[idx]+1;
        }    
        // Arrays.sort(frqS);
        for(int j=0; j<t.length(); j++){
            char cht= t.charAt(j);
            int idx = (int)(cht-'a');
            frqT[idx] =frqT[idx]+1;
        }       
    // Arrays.sort(frqT);
     for (int i = 0; i < 26; i++) {
            if (frqS[i] != frqT[i]) {
                return false;
            }
        }
        return true;      
    }
}