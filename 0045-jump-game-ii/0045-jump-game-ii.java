class Solution {
    public int jump(int[] nums) {
        int s=0;
        int e=0;
        int j=0;
        while(e<nums.length-1){
            int max=0;
            for(int i=s;i<=e;i++){
                max=Math.max(max,i+nums[i]);
            }
            s=e+1;
            e=max;
            j++;
        }
        return j;
    }
}