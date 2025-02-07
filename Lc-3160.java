class Solution {
    public int[] queryResults(int limit, int[][] queries) {
        HashMap<Integer,Integer> freq=new HashMap<>();
        HashMap<Integer,Integer> balls=new HashMap<>();
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int ball=queries[i][0];
            int col=queries[i][1];
            if(balls.containsKey(ball)){
                if(balls.get(ball)==col){
                     ans[i]=freq.size();
                     continue;
                }
                else{
                    if(freq.get(balls.get(ball))==1) freq.remove(balls.get(ball));
                  else{
                    freq.put(balls.get(ball),freq.get(balls.get(ball))-1);}
                    freq.put(col,freq.getOrDefault(col,0)+1);
                  
                    balls.put(ball,col);
                }

            }
            else{
                balls.put(ball,col);
                freq.put(col,freq.getOrDefault(col,0)+1);
            }
            ans[i]=freq.size();
        }
        return ans;
    }
}