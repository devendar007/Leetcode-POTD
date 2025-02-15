class Solution {
    public boolean helper(int idx,String num,int sum,int x){
        if(idx==num.length()){
            return x==sum;
        }
        for(int i=idx;i<num.length();i++){
            String t=num.substring(idx,i+1);
            if(helper(i+1,num,sum+Integer.parseInt(t),x)) return true;
        }
        return false;
    }
    public int punishmentNumber(int n) {
       
        int sum=0;
        for(int i=1;i<=n;i++){
             String num=Integer.toString(i*i);
        if(helper(0,num,0,i)) sum+=i*i;
        }
        return sum;
    }
}