class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int ans[]=new int[A.length];
        int sum=0;
        int freq[]=new int[A.length+1];
        for(int i=0;i<A.length;i++){
            freq[A[i]]++;
            if(freq[A[i]]==2) sum++;
            freq[B[i]]++;
            if(freq[B[i]]==2) sum++;
            ans[i]=sum;

        }
        return ans;
    }
}