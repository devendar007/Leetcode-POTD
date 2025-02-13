class Solution {
    public int minOperations(int[] nums, int k) {
      PriorityQueue<Long> pq=new PriorityQueue<>();
      int count=0;
        for(int it:nums) pq.add((long)it);
        while(pq.size()>1&&pq.peek()<k){
            count++;
            long x=pq.poll();
            long y=pq.poll();
            long val=Math.min(x,y)*2+Math.max(x,y);
            pq.add(val);
            if(pq.peek()>=k) return count;

        }
        return count;
    }
}