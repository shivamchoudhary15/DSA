class Solution {
    public int longestSubarray(int[] nums) {
        int i=0;
        int max=0;
        int c=0;
        while(i<nums.length){
            if(nums[i]==0){
                c++;
                int j=i;
                int count=0;
                while(j<nums.length-1 && nums[j+1]!=0){
                    count++;
                    j++;
                }
                int k=i;
                while(k>0 && nums[k-1]!=0){
                    count++;
                    k--;
                }
                max=Math.max(max,count);
            }
            i++;
        }
        if(c==nums.length) return 0;
        if(max==0) return  nums.length-1;
        return max;
    }
}