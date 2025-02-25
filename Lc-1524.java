class Solution {
    int mod=(int)1e9+7;
    public int numOfSubarrays(int[] arr) {
       int evenCount=1;
       int oddCount=0;
       int currSum=0;
       int result=0;
       for(int i=0;i<arr.length;i++){
        currSum+=arr[i];
        if(currSum%2==0){
         result=(result+oddCount)%mod;
         evenCount++;
        }
        else{
            result=(result+evenCount)%mod;
            oddCount++;
        }
       }
       return result;
    }
}