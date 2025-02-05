class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int i=0;
        int  j=0;
        int count=0;
        if(s1.equals(s2)) return true;
        for(int k=0;k<s1.length();k++){
            if(s1.charAt(k)!=s2.charAt(k)){
                count++;
                if(count>2) return false;
                else if(count==1){
                    i=k;
                }
                else j=k;
            }
        }
        return s1.charAt(i)==s2.charAt(j)&&s2.charAt(i)==s1.charAt(j);
    }
}