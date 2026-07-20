class Solution {
    public boolean increasingTriplet(int[] nums) {
         int f= Integer.MAX_VALUE;
        int s= Integer.MAX_VALUE;
        for (int x : nums) {
            if (x <= f) {
                f = x;
            } else if (x <= s) {
                s= x;
            } else {
                return true;
            }
        }

        return false;
    }
}