class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        for(int op[]:operations){
            int old=op[0];
            int n=op[1];
            int ind=map.get(old);
            nums[ind]=n;
            map.remove(old);
            map.put(n,ind);
        }
        return nums;
    }
}