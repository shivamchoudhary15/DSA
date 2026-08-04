class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        HashSet<Integer> k=new HashSet<>();
        for(int i:nums){
            k.add(i);
        }
        int max=nums[nums.length-1];
        int min=nums[0];
        while(min<max){
            if(!k.contains(min)){
                res.add(min);
            }
            min++;
        }
        return res;
        
    }
}