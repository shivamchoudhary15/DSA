class Solution {
    public long coloredCells(int n) {
        long sum = 1L + 2L * n * (n - 1);
        return sum;
    }
}



