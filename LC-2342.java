class Solution {
    public long helper(int num){
        long sum=0;
        while(num!=0){
            sum+=num%10;
            num=num/10;
        }
        return sum;
    }
    public int maximumSum(int[] nums) {
        Arrays.sort(nums);
        HashMap<Long,Integer> mp=new HashMap<>();
        int max=-1;
        for(int i=0;i<nums.length;i++){
            long sum=helper(nums[i]);
            if(mp.containsKey(sum)){
                max=Math.max(max,nums[i]+nums[mp.get(sum)]);
            }
            mp.put(sum,i);
        }
        return max;
    }
}