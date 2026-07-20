class Solution {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int dp[][]=new int[nums.length/3][3];
        for(int i=0;i<=nums.length-3;i=i+3){
            int x=nums[i];
            int y=nums[i+1];
            int z=nums[i+2];
            if(y-x>k || z-y>k || z-x>k){
                return new int[0][0];
            }
            dp[i/3]=new int[]{x,y,z};
        }
        return dp;
    }
}