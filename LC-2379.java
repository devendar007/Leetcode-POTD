class Solution {
    public int minimumRecolors(String blocks, int k) {
        int i=0;
        int j=0;
        int req=0;
        int max=Integer.MAX_VALUE;
        while(j<blocks.length()){
            char ch=blocks.charAt(j);
            if(ch=='W') req++;
         if((j-i+1)==k){
            max=Math.min(max,req);
            if(blocks.charAt(i)=='W') req--;
            i++;
         }
         j++;
        }
        return max;
    }
}