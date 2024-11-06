class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();

        for(int i=0; i<nums.length; i++){
            if(pr.size()< k){
                pr.add(nums[i]);

             }else if(pr.peek()<nums[i]){
                pr.remove();
                pr.add(nums[i]);
             }
        }

        return pr.peek();
    }
}