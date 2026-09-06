class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int n = nums.length;
        int[] ans= new int[n];
        ans[n - 1] = nums[n - 1];
        for (int i=n-2;i>= 0;i--) {
           ans[i]=Math.min(nums[i], ans[i + 1]);
        }
        int lmax= nums[0];
        for (int i =0; i<n;i++) {
            lmax= Math.max(lmax, nums[i]);
            int s= lmax- ans[i];
            if (s<= k) {
                return i;
            }
        }

        return -1;
        
    }
}