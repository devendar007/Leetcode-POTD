class Solution {
    String ans="";
    public void helper(int i,Set<String> st,String s){
        if(i==st.size()){
            if(!st.contains(s)&&ans.length()==0){
                ans+=s;
                            }
                            return;
        }
        for(char ch='0';ch<='1';ch++){
            helper(i+1,st,s+ch);
        }
    }
    public String findDifferentBinaryString(String[] nums) {
        Set<String> st=new HashSet<>();
        for(String it:nums) st.add(it);
       helper(0,st,"");
       return ans;
    }
}