class Solution {
    public int getSetBit(int num){
    int i=0;
    while((num&(1<<i))==0) i++;
   return i;
    }
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int xor=0;
        int n=grid.length;
        for(int i=1;i<=(n*n);i++) xor^=i;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) xor^=grid[i][j];
        }
        int setbit=getSetBit(xor);
        int num1=0;
        int num2=0;
        for(int i=1;i<=(n*n);i++){
            if((i&(1<<setbit))!=0) num1^=i;
            else num2^=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++) {
                   if((grid[i][j]&(1<<setbit))!=0) num1^=grid[i][j];
            else num2^=grid[i][j];
            }
        }
        boolean flag=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(num1==grid[i][j]) flag=true;
            }
        }
        if(flag==true) return new int[]{num1,num2};
        return new int[]{num2,num1};
    }
}