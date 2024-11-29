class Solution {
    public boolean makeEqual(String[] words) {
     int[] frq = new int[26];

     for(int i=0; i<words.length; i++){
        String w = words[i];

        for(int j=0; j<w.length(); j++){
            char ch= w.charAt(j);
            int idx = (int)(ch -'a');

        frq[idx]= frq[idx] + 1;
        }

     }  

     for(int i=0; i<26; i++){
        if(frq[i] % words.length !=0){
            return false;
        }
     }

    return true;
    }
}