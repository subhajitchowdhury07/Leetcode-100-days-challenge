class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;  //shows in
        int sec = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;

        for(int i=0; i<nums.length;i++){
            if(first >= nums[i]){
                first =nums[i];
            }else if(sec >= nums[i]){
                sec= nums[i];

            }
            else{
                third= nums[i];
                return true;
            }

        }

        return false;
    }
}