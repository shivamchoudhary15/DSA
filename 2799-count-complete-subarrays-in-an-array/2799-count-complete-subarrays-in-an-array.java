class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int count=0;
        HashSet<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        int n=set.size();
        for(int i=0;i<nums.length;i++){
            HashSet<Integer> set1=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                set1.add(nums[j]);
                if(set1.size()==n){
                    count++;
                }
            }
        }
        return count;
    }
}