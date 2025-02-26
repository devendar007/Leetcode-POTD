class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int minsum=0;
        int maxsum=0;
        int sum1=0;
        int sum2=0;
        for(int i=0;i<nums.length;i++){
        sum1+=nums[i];
            sum2+=nums[i];
             minsum=Math.min(minsum,sum2);
            maxsum=Math.max(maxsum,sum1);
            if(sum1<0){
                sum1=0;
            }
            if(sum2>0){
                sum2=0;
            }
           

        }
        return Math.max(maxsum,Math.abs(minsum));
    }
}