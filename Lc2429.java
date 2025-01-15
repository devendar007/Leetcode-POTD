class Solution {
    public boolean isSet(int x,int bit){
        return   (x&(1<<bit))!=0;
    }
    public int setBit(int x,int bit){
        return  x|(1<<bit);
    }
    public int unsetBit(int x,int bit){
              return x&~(1<<bit);
    }
    public int minimizeXor(int num1, int num2) {
        int x=num1;
        int reqbit=Integer.bitCount(num2);
        int currbit=Integer.bitCount(num1);
        int bit=0;
        if(reqbit>currbit){
        while(reqbit>currbit){
            if(!isSet(x,bit)){
                x=setBit(x,bit);
                currbit++;
            }
            bit++;
        }
        }
        else if(reqbit<currbit){
            while(reqbit<currbit){
          if(isSet(x,bit)){
            x=unsetBit(x,bit);
            currbit--;

          }
          bit++;
          }
        }
        return x;
    }
}