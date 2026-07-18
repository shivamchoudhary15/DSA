class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int a=nums[0];
        int b=nums[nums.length-1];
        int i=1;
        int ans=0;
        while(i<=a){
            if(a%i==0 && b%i==0){
                ans=i;
            }
            
            i++;
        }
        return ans;
    }
}