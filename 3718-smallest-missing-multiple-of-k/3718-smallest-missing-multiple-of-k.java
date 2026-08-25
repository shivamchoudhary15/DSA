class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        if(!set.contains(k)){
            return k;
        }
        int i=1;
        int ans=k;
        while(set.contains(ans)){
            ans=k*i;
            i++;
            
        }
        return ans;
    }
}