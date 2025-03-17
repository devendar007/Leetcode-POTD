class Solution {
    public boolean divideArray(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        for(int value:mp.values()){
            if((value%2)!=0) return false;
        }
        return true;

    }
}