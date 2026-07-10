class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] q, int x) {
         ArrayList<Integer> ind =new ArrayList<>();
        for (int i=0;i<nums.length;i++) {
            if (nums[i] == x) {
                ind.add(i);
            }
        }
        int[] ans=new int[q.length];
        for (int i=0;i<q.length; i++) {
            int k = q[i];
            if (k>ind.size()) {
                ans[i] = -1;
            } else{
                ans[i] = ind.get(k - 1);
            }
        }
        return ans;
    }
}