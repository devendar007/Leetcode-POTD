class Solution {
    public int minimumIndex(List<Integer> nums) {
    int ele=-1;
    int count=0;
    int j=0;
    while(j<nums.size()){
        if(count==0){
            count=1;
            ele=nums.get(j);
        }
        else if(nums.get(j)==ele) count++;
        else count--;
        j++;
    }
    int countx=0;
    for(int it:nums){
        if(it==ele) countx++;
    }
    count=0;
  for(int i=0;i<nums.size();i++){
    if(nums.get(i)==ele) count++;
    int rem=countx-count;
    if(count>((i+1)/2)&&(rem>(nums.size()-i-1)/2)) return i;
  }  
  return -1;
    }
}