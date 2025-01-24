class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        Queue<Integer> q=new LinkedList<>();
        int v=graph.length;
        int[] indegree=new int[v];
        ArrayList<ArrayList<Integer>> revadj=new ArrayList<>();
        for(int i=0;i<v;i++) revadj.add(new ArrayList<>());
        for(int i=0;i<v;i++){
            for(int it:graph[i]){
               revadj.get(it).add(i);
                indegree[i]++;
            }
        }
      for(int i=0;i<v;i++){
        if(indegree[i]==0) q.add(i);
      }
      List<Integer> ans=new ArrayList<>();
      while(q.size()!=0){
       int node=q.poll();
       ans.add(node);
       for(int it:revadj.get(node)){
        indegree[it]--;
        if(indegree[it]==0) q.add(it);
       }

      }
   Collections.sort(ans);
      return ans;
    }
}