class Solution {
    public int tupleSameProduct(int[] nums) {
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int p=nums[i]*nums[j];
                mp.put(p,mp.getOrDefault(p,0)+1);
            }
        }
        int tuple=0;
        for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
            if(entry.getValue()>1){
                int x=entry.getValue();
                tuple+=(x*(x-1))/2;
            }
        }
        return tuple*8;
    }
}