class Solution {
    public int[] searchRange(int[] nums, int target) {
        if(nums.length==0){
            return new int[]{-1,-1};
        }

        int p1=-1;
        int p2=-1;
        int arr[] = new int[2];

        for(int i=0; i<nums.length;i++){
            if(nums[i] == target){
                p1=i;
                break;
            }
        }

        for(int j=nums.length-1; j>=0; j--){
            if(nums[j]== target){
                p2= j;
                break;
            }
        }
        if(p1 != -1 && p2 != -1){
            arr[0]= p1;
            arr[1]= p2;
        }else{
            arr[0]= -1;
            arr[1]= -1;
        }

        return arr;
        
    }
}
