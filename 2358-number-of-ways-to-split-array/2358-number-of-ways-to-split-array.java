class Solution {
    public int waysToSplitArray(int[] nums) {
        int n =nums.length;
        long totalSum =0;
        int count =0;
        long perfex_sum=0;
        for(int num : nums){
            totalSum += num;
        }

        for(int i =0;i <n-1; i++){
            perfex_sum += nums[i];
            if(perfex_sum >= totalSum - perfex_sum){
                count++;
            }
        }

        return count;
    }
}