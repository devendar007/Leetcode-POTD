class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int temp=0;
        for(int i=0;i<derived.length-1;i++){
            temp=temp^derived[i];
        }
        if((temp^0)==derived[derived.length-1]) return true;
        temp=1;
        for(int i=0;i<derived.length-1;i++){
            temp=temp^derived[i];
        }
        if((temp^1)==derived[derived.length-1]) return true;
        return false;
        
    }
}