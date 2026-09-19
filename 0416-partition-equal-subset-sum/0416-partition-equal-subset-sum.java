class Solution {
    public boolean canPartition(int[] nums) {
         int n=nums.length;
        int sum=0;
        for(int i:nums){
            sum+=i;
        }
        if(sum%2!=0) return false;
      boolean  t[][]=new boolean[n+1][sum+1];
      return  knapsack(t,nums,sum/2);
    }
    public static boolean knapsack(boolean [][] t,int [] nums,int sum){
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(j==0){
                    t[i][j]=false;
                }
            }
        }
        for(int i=0;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(j==0){
                    t[i][j]=true;
                }
            }
        }
        for(int i=1;i<t.length;i++){
            for(int j=0;j<t[0].length;j++){
                if(nums[i-1]<=j){
                    t[i][j]=t[i-1][j-nums[i-1]] || t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[nums.length][sum];
    }
    
}