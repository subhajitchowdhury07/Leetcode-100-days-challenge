class Solution {
    public void reverseString(char[] s) {
        // StringBuilder<Character> sb = new StringBuilder("");
        // for(int i=s.length-1; i>0; i--){
        //     // char curr =s.charAt(i);
        //     sb.append(s[i]);
        // }

        int count=0;
        
        for(int i=s.length-1; i>count;i--){

            if(i == count){
                break;
            }
            char temp =s[i];
            s[i]= s[count];
            s[count] = temp;

            count++;
        }

        // return s;
    }
}