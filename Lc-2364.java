class Solution {
    public long countBadPairs(int[] nums) {
     long count=0;
     HashMap<Long,Integer> mp=new HashMap<>();
     for(int i=0;i<nums.length;i++){
        long diff=nums[i]-i;
        int badpair=i;
        if(mp.containsKey(diff)){
      badpair=badpair-mp.get(diff);
        }
        count+=badpair;
        mp.put(diff,mp.getOrDefault(diff,0)+1);
     }   
     return count;
    }
}