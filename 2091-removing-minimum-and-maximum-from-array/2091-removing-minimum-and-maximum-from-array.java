class Solution {
    public int minimumDeletions(int[] nums) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        if(nums.length==1) return 1;
        int ans=Integer.MAX_VALUE;
        int countmax=0;
        int countmin=0;
        for(int i:nums){
            max=Math.max(max,i);
            min=Math.min(min,i);
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==max){
                break;
            }
            countmax++;
        }
          for(int i=0;i<nums.length;i++){
            if(nums[i]==min){
                break;
            }
            countmin++;
        }
        int countmax1=0;
        int countmin1=0;
         for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==max){
                break;
            }
            countmax1++;
        }
          for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==min){
                break;
            }
            countmin1++;
        }
        int ans1 = Math.max(countmax, countmin) + 1;
       int ans2 = (countmax + 1) + (countmin1 + 1);
        int ans3 = (countmax1 + 1) + (countmin + 1);
       int ans4 = Math.max(countmax1, countmin1) + 1;
        int min1=Math.min(ans1,Math.min(ans2,Math.min(ans3,ans4)));
        return min1;
    }
}