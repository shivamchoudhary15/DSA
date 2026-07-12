class Solution {
    public long findScore(int[] nums) {
        long ans=0;
        boolean arr[]=new boolean[nums.length];
        TreeMap<Integer,ArrayList<Integer>> map=new TreeMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.get(nums[i]).add(i);
            }
            else{
            ArrayList<Integer> res=new ArrayList<>();
            res.add(i);
            map.put(nums[i],res);
            }
        
        }
        for(Map.Entry<Integer,ArrayList<Integer>> e:map.entrySet()){
            int v=e.getKey();
            for(int i:e.getValue()){
                if(!arr[i]){
                ans+=v;
                arr[i]=true;
                if (i >0){
                    arr[i - 1] = true;
                }
                 if (i < nums.length - 1){
                    arr[i+ 1] = true;
                 }
                }
            }
        }
        return ans;
    }
}

