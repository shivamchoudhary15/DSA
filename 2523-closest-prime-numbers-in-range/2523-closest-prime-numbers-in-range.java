class Solution {
    public int[] closestPrimes(int left, int right) {
         boolean[] isprime = new boolean[right + 1];
        Arrays.fill(isprime, true);

        if (right >= 0) isprime[0] = false;
        if (right >= 1) isprime[1] = false;

        for (int i = 2;i*i<=right; i++) {
            if (isprime[i]){
                for (int j=i*i;j<=right;j += i) {
                    isprime[j] = false;
                }
            }
        }
        int prev = -1;
        int diff = Integer.MAX_VALUE;
        int[] ans = {-1, -1};
        for (int i = left;i<=right;i++) {
            if(isprime[i]){
                if (prev !=-1 && i-prev < diff) {
                    diff=i -prev;
                    ans[0]=prev;
                    ans[1]=i;
                }
                prev = i;
            }

        }
        return ans;
    }
}
