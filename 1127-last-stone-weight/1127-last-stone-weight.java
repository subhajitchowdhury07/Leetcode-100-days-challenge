class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> hm = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele : stones){
                hm.add(ele);
            }

            while(hm.size()>1){
                int first = hm.remove();
                int sec = hm.remove();

                int nval= first - sec;
                if(nval !=0){
                    hm.add(nval);
                }
            }

            if(hm.size()==0){
                return 0;
            }else{
               return hm.remove();
            }

            
        }
}