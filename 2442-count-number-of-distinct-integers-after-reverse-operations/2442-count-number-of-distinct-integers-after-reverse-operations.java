class Solution {
    public int countDistinctIntegers(int[] nums) {
        HashSet<Integer> res=new HashSet<>();
        for(int i:nums){
            res.add(i);
            StringBuilder s=new StringBuilder(""+i);
            String m=s.reverse().toString();
            int k=Integer.parseInt(m);
            res.add(k);
        }
        return res.size();
    }
}