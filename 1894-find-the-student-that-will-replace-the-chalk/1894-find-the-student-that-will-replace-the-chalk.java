class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for (int x : chalk) {
            sum += x;
        }
        k%=sum;
        int n=chalk.length-1;
        for (int i = 0; i < chalk.length; i++) {
            if (k < chalk[i]) {
                return i;
            }
            k -= chalk[i];
        }
        return 0;
    }
}