class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {

      TreeMap<Integer,Integer> mp=new TreeMap<>();
      for(int i=0;i<nums1.length;i++){
        mp.put(nums1[i][0],nums1[i][1]);
      }
      for(int i=0;i<nums2.length;i++){
        if(mp.containsKey(nums2[i][0])){
            mp.put(nums2[i][0],mp.get(nums2[i][0])+nums2[i][1]);
        }
        else mp.put(nums2[i][0],nums2[i][1]);
      }
      int ans[][]=new int[mp.size()][2];
      int i=0;
      for(Map.Entry<Integer,Integer> entry:mp.entrySet()){
        ans[i][0]=entry.getKey();
        ans[i][1]=entry.getValue();
      i++;
      }
      return ans;

    }
}