class Solution {
    public int removeElement(int[] nums, int val) {
        // int[] arr = new int[nums.length-1];
        int k=0;  // pointer 
        for(int i=0; i<nums.length; i++){
        if(nums[i]!= val){
                // arr[k]= nums[i];
                // k++;
                // temp=nums[i];
                nums[k] = nums[i];
                // nums[i+1] = temp;
                k++;

            }
            
        }
        return k;
    }
}