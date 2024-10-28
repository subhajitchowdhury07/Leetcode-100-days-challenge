class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        Arrays.sort(nums);
        // int count =0;
        // int arr[] = new arr[nums.length];\

        List<Integer> result = new ArrayList<>();
        for(int i=0; i <nums.length; i++){
            if(nums[i] == target){
                result.add(i);
            //     count++;
            // }else if( nums[i] > target){
            //     arr[count] = i-1;
            // }
        }


    }
        return result;
}
}