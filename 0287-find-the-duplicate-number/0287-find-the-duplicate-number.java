class Solution {
    public int findDuplicate(int[] nums) {
        // HashSet<Integer> hm= new HashSet<>();

        // for(int num : nums){
        //     if(hm.contains(num)){
        //         return num;
        //     }
        //     hm.add(num);
        // }

        // return -1;

        boolean isUnique [] = new boolean[nums.length]; // default all the values are false

        for(int i=0; i<nums.length; i++){
            if(isUnique[nums[i]] == true){
                return nums[i];
            } 
            else {
                isUnique[nums[i]] = true;
            }
        }
        return -1;
    }
}