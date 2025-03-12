class Solution {
    public int lowerbound(int nums[]){
        int st=0;
        int end=nums.length-1;
        int ans=nums.length;

        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]>0){
                ans=mid;
                end=mid-1;
            }
            else st=mid+1;
        }
        return ans;
    }
    public int upperbound(int nums[]){
        int st=0;
        int end=nums.length-1;
        int ans=nums.length;
        while(st<=end){
            int mid=st+(end-st)/2;
            if(nums[mid]<0){
                st=mid+1;
               
            }
            else {end=mid-1;
            ans=mid;}

        }
        return ans;
    }

    public int maximumCount(int[] nums) {
          
    int negcount=upperbound(nums);
    int poscount=nums.length-lowerbound(nums);
    return Math.max(negcount,poscount);
    }
}