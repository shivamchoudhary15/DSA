class Solution {
    public int minOperations(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>=nums[i+1]){
                int a=nums[i+1];
                nums[i+1]=nums[i]+1;
                sum+=(nums[i+1]-a);
            }
        }
        return sum;
    }
}