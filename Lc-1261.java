
class FindElements {

 
TreeNode temp=null;
    public FindElements(TreeNode root) {
  temp=root;
 root.val=0;
  Queue<TreeNode> q=new LinkedList<>();
  q.add(root);
  while(q.size()!=0){
    int n=q.size();
    for(int i=0;i<n;i++){
        TreeNode t=q.poll();
        int x=t.val;
      
        if(t.left!=null) {
        t.left.val=2*x+1;
        q.add(t.left);}
        if(t.right!=null){
            t.right.val=2*x+2;
            q.add(t.right);
        }
    
    }
  }
        
    }
    public boolean helper(TreeNode root,int x){
        if(root==null) return false;
        if(root.val==x) return true;
        return helper(root.left,x)||helper(root.right,x);
    }
    
    public boolean find(int target) {
      return helper(temp,target);
    }
}

/**
 * Your FindElements object will be instantiated and called as such:
 * FindElements obj = new FindElements(root);
 * boolean param_1 = obj.find(target);
 */