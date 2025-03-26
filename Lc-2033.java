class Solution {
   
    public int minOperations(int[][] grid, int x) {
        int n=grid.length;
        int m=grid[0].length;
     int ans[]=new int[n*m];
     int k=0;
     for(int i=0;i<n;i++){
        for(int j=0;j<m;j++){
            ans[k++]=grid[i][j];
        }
     }
     Arrays.sort(ans);
     int mid=ans[(n*m)/2];
     int count=0;
     for(int i=0;i<ans.length;i++){
       int diff=Math.abs(ans[i]-mid);
       if((diff%x)!=0) return -1;
       count+=diff/x;
     }
     return count;
    }
}