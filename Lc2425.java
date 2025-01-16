class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
     int n1=nums1.length;
     int n2=nums2.length;
     int xor=0;
      HashMap<Integer,Integer> mp =new HashMap<>();
      for(int num:nums1){
        mp.put(num,mp.getOrDefault(num,0)+n2);
      }
      for(int num:nums2){
        mp.put(num,mp.getOrDefault(num,0)+n1);
      }
      for(int key:mp.keySet()){
        if(mp.get(key)%2==1){
      xor^=key;
        }
      }
      return xor;
    }
}