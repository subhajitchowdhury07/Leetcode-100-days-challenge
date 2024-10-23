class Solution {
    public int searchInsert(int[] nums, int target) {
    for(int i=0; i< nums.length; i++){
        if( target < nums[0]){
            return 0;
        }
        else if(nums[i] ==  target){
            return i;
        }else if (nums[i]== (target-1)){
            return i+1;
       }else if (nums[i]== (target+1)){
            return i;
       }
       else if(target > nums[nums.length-1]){
        return nums.length;
       }
       
    }
    return -1;
    }
}