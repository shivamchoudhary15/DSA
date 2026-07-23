class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length<3){
            return nums.length;
        }
       return Integer.highestOneBit(nums.length<<1);
    }
}