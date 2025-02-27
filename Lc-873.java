class Solution {
    public int lenLongestFibSubseq(int[] arr) {
        Set<Integer> st=new HashSet<>();
        for(int it:arr) st.add(it);
        int max=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
            int prev1=arr[i];
            int prev2=arr[j];
            int c=2;
            while(st.contains(prev1+prev2)){
                int temp=prev1;
                prev1=prev2;
                prev2=temp+prev2;
                c++;
                   max=Math.max(max,c);
            }
         
            }
        }
        return max;
    }
}