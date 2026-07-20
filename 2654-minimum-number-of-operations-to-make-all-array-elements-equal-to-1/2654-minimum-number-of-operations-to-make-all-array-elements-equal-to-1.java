class Solution {
    public int minOperations(int[] nums) {
       int ans = Integer.MAX_VALUE;
       int n=nums.length;
       int count=0;
       for(int i:nums){
          if(i==1){
            count++;
          }
       }
        if (count > 0) {
            return n - count;
        }
        for (int i=0;i<n;i++) {
            int g=0;
            for (int j=i;j<n;j++) {
                g = gcd(g, nums[j]);
                if (g == 1) {
                    ans = Math.min(ans, j - i + 1);
                    break; 
                }
            }
        }
        if(ans==Integer.MAX_VALUE) return -1;
        return n+ans-2;

    }
    public static int gcd(int a, int b) {
    while (b != 0) {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}
}