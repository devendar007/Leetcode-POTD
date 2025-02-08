class NumberContainers {
    HashMap<Integer,Integer> mp=new HashMap<>();
    HashMap<Integer,TreeSet<Integer>> mp2=new HashMap<>();

    public NumberContainers() {
        
    }
    
    public void change(int index, int number) {
        if(mp.containsKey(index)){
            int num=mp.get(index);
            mp2.get(num).remove(index);
          if(mp2.get(num).size()==0) mp2.remove(num);
        }
        mp.put(index,number);
        if(!mp2.containsKey(number)){
            mp2.put(number,new TreeSet<>());
        }
        mp2.get(number).add(index);
    }
    
    public int find(int number) {
        if(mp2.containsKey(number)){
            return mp2.get(number).first();
        }
     return -1;
    }
}

/**
 * Your NumberContainers object will be instantiated and called as such:
 * NumberContainers obj = new NumberContainers();
 * obj.change(index,number);
 * int param_2 = obj.find(number);
 */