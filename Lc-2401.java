class Solution {
    public int longestNiceSubarray(int[] nums) {
        int l=0;
        int r=0;
        int max=0;
        int bitMask=0;
        while(r<nums.length){
     while((bitMask&nums[r])!=0){
        bitMask^=nums[l];
        l++;
     }
     bitMask|=nums[r];
     max=Math.max(max,r-l+1);
     r++;
        }
        return max;

    }
}