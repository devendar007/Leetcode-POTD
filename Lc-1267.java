class Solution {
    public void check(int grid[][],int r,int c,boolean vis[][]){
        
        for(int i=0;i<grid.length;i++){
            if(i!=r&&grid[i][c]==1){
                vis[r][c]=true;
                vis[i][c]=true;
            }
        }
        for(int j=0;j<grid[0].length;j++){
            if(j!=c&&grid[r][j]==1){
                vis[r][c]=true;
                vis[r][j]=true;
            }
        }
    }
    public int countServers(int[][] grid) {
        int count=0;
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1){
                 check(grid,i,j,vis);
                }
            }
        }
     for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==true) count++;}}
        return count;
    }
}