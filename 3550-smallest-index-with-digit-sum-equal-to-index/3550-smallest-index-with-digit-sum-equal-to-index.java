class Solution {
    public int smallestIndex(int[] nums) {
         for(int i=0;i<nums.length;i++){
            if(i==issum(nums[i])){
                return i;
            }
         }
         return -1;
    }
    public static int issum(int k){
        int ans=0;
        while(k!=0){
            int n=k%10;
            ans+=n;
            k=k/10;
        }
        return ans;
    }
}