class Solution {
    public int maxScore(String s) {
        int z =0;
        int one =0;
        int sum=0;
        for(int i=0; i<s.length(); i++){
            Character ch = s.charAt(i);

            if(ch == '1'){
                one++;
            }
        }

        for(int i=0;i<s.length()-1 ;i++){
            if(s.charAt(i) == '1'){
                one--;
            }else{
                z++;
            }
            sum =Math.max(sum,one+z);
        }

        return sum;
    }
}