class Solution {
    public static void permute(List<List<Integer>> res,boolean[] used,ArrayList<Integer> temp,int [] nums){
        if(temp.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return ;
        }

        for (int i=0;i<nums.length; i++) {
            if (used[i]) continue;
            if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
                continue;
            used[i] = true;
            temp.add(nums[i]);
            permute(res, used, temp, nums);
            temp.remove(temp.size() - 1);
            used[i] = false;
        }
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
         Arrays.sort(nums);
         boolean used[]=new boolean[nums.length];
        List<List<Integer>> res=new ArrayList<>();
        permute(res,used,new ArrayList<>(),nums);
        return res;
    }
}