class Solution {
    public int triangularSum(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        for(int i:nums){
            res.add(i);
        }
      
        while(res.size()!=1){
            ArrayList<Integer> temp = new ArrayList<>();
            for (int i = 0; i < res.size() - 1; i++) {
                temp.add((res.get(i) + res.get(i + 1)) % 10);
            }
            res = temp;
        }
           
        return res.get(0);
    }
}