class Solution {
    public int minCost(int[][] grid) {
     PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]!=a[1]?Integer.compare(a[0],b[0]):a[1]!=b[1]?Integer.compare(a[1],b[1]):Integer.compare(a[2],b[2]));

        pq.add(new int[]{0,0,0});
        int n=grid.length;
        int m=grid[0].length;
        int dist[][]=new int[n][m];
    
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) dist[i][j]=(int)1e9;
        }
            dist[0][0]=0;
        int drow[]={0,0,1,-1};
        int dcol[]={1,-1,0,0};
        
        while(pq.size()!=0){
         int []arr=pq.poll();
         int cost=arr[0];
         int r=arr[1];
         int c=arr[2];
         for(int i=0;i<4;i++){
            int nrow=drow[i]+r;
            int ncol=dcol[i]+c;
            if(nrow>=0&&nrow<n&&ncol>=0&&ncol<m){
                int dir=grid[r][c];
                int newcost=dir-1!=i?1:0;
                if(newcost+cost<dist[nrow][ncol]){
                    dist[nrow][ncol]=newcost+cost;
                    pq.add(new int[]{dist[nrow][ncol],nrow,ncol});
                }
            }
         }
        }
        return dist[n-1][m-1];
    }
}