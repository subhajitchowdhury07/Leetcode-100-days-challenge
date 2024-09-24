class Solution {
    public int maxArea(int[] height) {
        int start= 0;
        int end =height.length-1;

        int maxheight=0;

        while(start<end){
            int h =Math.min(height[start], height[end]);
            int width= end - start;
            int currCap = h* width;

            maxheight = Math.max(currCap , maxheight);

            if(height[end]> height[start]){
                start++;  // (height[start] < height[end])
                          // start++;
            }else{
                end--;
            }


        }

        return maxheight;
    }
}