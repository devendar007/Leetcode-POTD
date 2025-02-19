class Solution {
    public void helper(int n,String s,List<String> ans){
        if(s.length()==n){
            ans.add(s);
            return;
        }
        for(char ch='a';ch<='c';ch++){
            if(s.length()>0){
                if(ch==s.charAt(s.length()-1)) continue;
            }
            helper(n,s+ch,ans);
        }
    }
    public String getHappyString(int n, int k) {
        List<String> ans=new ArrayList<>();
        helper(n,"",ans);
        if(k>ans.size()) return "";
        return ans.get(k-1);
    }
}