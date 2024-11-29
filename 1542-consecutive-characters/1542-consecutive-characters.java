class Solution {
    public int maxPower(String s) {
    //     int[] frq = new int[26];
    //     int max=0;

    //     for(int i=0; i<s.length(); i++){
    //         char ch = s.charAt(i);
    //         int idx = (int)(ch-'a');

    //         frq[idx] = frq[idx]+1;

    //     }
        
    //     for(int i =0; i<26; i++){
    //         max = Math.max(max, frq[i]);
    //     }

    //     return max;
    // }



    // wrong for some part 


    int max=1; int count=1;
    for(int i=1; i<s.length(); i++){
        if(s.charAt(i) == s.charAt(i-1)){
            count++;
            max= Math.max(max, count);
        }else{
            count=1;
        }

    }
        return max;
}
}