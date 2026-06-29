class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                if(!map.containsKey(e.getKey()-1) && !map.containsKey(e.getKey()+1)){
                    ans.add(e.getKey());
                }
            }
        }
        return ans;
    }
}