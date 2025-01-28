
class Solution {
    public int bfs(int grid[][],int r,int c){
        int fish=0;
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        int n=grid.length;
        int m=grid[0].length;
        boolean vis[][]=new boolean[n][m];
        vis[r][c]=true;
    Queue<int[]> q=new LinkedList<>();
    q.add(new int[]{r,c});
    while(q.size()!=0){
        int[] arr=q.poll();
        int row=arr[0];
        int col=arr[1];
        fish+=grid[row][col];
        for(int i=0;i<4;i++){
            int nrow=drow[i]+row;
            int ncol=dcol[i]+col;
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&!vis[nrow][ncol]&&grid[nrow][ncol]!=0){
                vis[nrow][ncol]=true;
                q.add(new int[]{nrow,ncol});
            }
        }
    }
    return fish;

    }

    public int findMaxFish(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int max=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]!=0){
                    max=Math.max(max,bfs(grid,i,j));
                }
            }
        }
        return max;
    }
}