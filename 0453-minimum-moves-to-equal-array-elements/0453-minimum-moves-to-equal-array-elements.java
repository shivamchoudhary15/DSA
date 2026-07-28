class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        int min=Integer.MAX_VALUE;
        for(int i:nums){
            sum+=i;
            min=Math.min(i,min);
        }
        return sum-nums.length*min;
    }
}