class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int max=1;
        int countinc=1;
        int countdec=1;
        for(int i=1;i<nums.length;i++){
         if(nums[i]>nums[i-1]) {
         countinc++;
         countdec=1;}
        
        else  if(nums[i]<nums[i-1]) 
        {countdec++;
         countinc=1;}
         else{
            countdec=1;
            countinc=1;
         }
 

         max=Math.max(max,Math.max(countinc,countdec));
        }
        return max;
    }
}