class Solution {
    public long maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length-1;
        long ans=1L*nums[0]*nums[n]*-100000L;
       
        ans=Math.max(ans,1L*nums[n]*nums[n-1]*100000L);
        ans=Math.max(ans,1L*nums[0]*nums[1]*100000L);
        return ans;
    }
}