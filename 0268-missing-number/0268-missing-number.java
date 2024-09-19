class Solution {
    public int missingNumber(int[] nums) {
        int n =nums.length;
        int actualSum = (n*(n+1))/2;
        int currentSum=0;
        int missingNum= 0;
        for(int i=0; i <nums.length; i++){
         currentSum = currentSum+ nums[i];
        }
        if(currentSum != actualSum){
            missingNum = actualSum - currentSum;
        }

        return missingNum;
    }
}