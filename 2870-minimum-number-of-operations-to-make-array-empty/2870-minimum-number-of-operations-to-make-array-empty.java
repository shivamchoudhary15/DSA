class Solution {
    public int minOperations(int[] tasks) {
       TreeMap<Integer,Integer> map=new TreeMap<>();
        for(int i:tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count=0;
    
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()<=1){
                return -1;
            }
            if(e.getValue()==3 || e.getValue()==2){
                count++;
            }
            else if(e.getValue()>3){
               count+=(e.getValue()+2)/3;
            }
        }
        if(count==0) return -1;
        return count;
    }
}
