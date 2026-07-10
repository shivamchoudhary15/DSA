class Solution {
    public int maxCoins(int[] piles) {
      Arrays.sort(piles);
      int ans=0;
      int l=0;
      int r=piles.length-1;
      while(l<=r){
        r--;
        ans+=piles[r];
        r--;
        l++;
      }
      return ans;
    }
}