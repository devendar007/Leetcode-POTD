class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int n=isWater.length;
        int m=isWater[0].length;
        int height[][]=new int[n][m];
        Queue<int[]> q=new LinkedList<>();
        boolean vis[][]=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(isWater[i][j]==1){
                    vis[i][j]=true;
                    q.add(new int[]{0,i,j});
                }
            }
        }
        int drow[]={-1,0,1,0};
        int dcol[]={0,1,0,-1};
        while(q.size()!=0){
            int []temp=q.poll();
            int h=temp[0];
            int r=temp[1];
            int c=temp[2];
            height[r][c]=h;
            for(int i=0;i<4;i++){
                int nrow=drow[i]+r;
                int ncol=dcol[i]+c;
                if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m&&!vis[nrow][ncol]){
                    vis[nrow][ncol]=true;
                    height[nrow][ncol]=h+1;
                    q.add(new int[]{h+1,nrow,ncol});
                }
            }
        }
return height;
    }
}