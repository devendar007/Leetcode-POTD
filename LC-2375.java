class Solution {
    public boolean helper(StringBuilder sb,boolean vis[],String pattern){
        if(1+pattern.length()==sb.length()) return true;
        for(int i=1;i<=9;i++){
            if(vis[i]) continue;
            int len=sb.length();
            if(len>0){
            int lastdigit=sb.charAt(sb.length()-1)-'0';
            if(pattern.charAt(len-1)=='I'&&i<=lastdigit) continue;
            if(pattern.charAt(len-1)=='D'&&i>=lastdigit) continue;
            }
         sb.append(i);
         vis[i]=true;
         if(helper(sb,vis,pattern)) return true;
         sb.deleteCharAt(sb.length()-1);
         vis[i]=false;
          
        }
        return false;
    }
    public String smallestNumber(String pattern) {
        boolean vis[]=new boolean[10];
        StringBuilder sb=new StringBuilder();
        helper(sb,vis,pattern);
        return sb.toString();
    }
}