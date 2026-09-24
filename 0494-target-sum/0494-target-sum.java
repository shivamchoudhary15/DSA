class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if((sum-target)/2<0 || (sum-target)%2!=0) return 0;    
        int s=(sum-target)/2;
        return knapsack(nums,s);
    }
    public static int knapsack(int [] nums,int target){
        int n=nums.length;
        int t[][]=new int[n+1][target+1];

        for(int i=0;i<=n;i++){
            t[i][0]=1;
        }
        for(int i=1;i<=n;i++){
            for(int j=0;j<=target;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j]+t[i-1][j-nums[i-1]];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][target];
    }
}