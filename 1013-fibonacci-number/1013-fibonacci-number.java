class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n == 1){
            return 1; 
             }
        int firstNum =0;
        int secondNum= 1;

        for(int i=1; i<=n ;i++){
            int thirdNum = firstNum + secondNum;

            firstNum = secondNum;
            secondNum= thirdNum;

        }
       return firstNum;
    }
}