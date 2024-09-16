class Solution {
    public boolean isPalindrome(int x) {
        int temp=0,y=x;
        if (x < 0){
            return false;
        }
        while(x !=0){
        int z =x%10;
        temp= temp*10+z;
        x /=10;
        }
        
        return temp==y;
       
    }
}