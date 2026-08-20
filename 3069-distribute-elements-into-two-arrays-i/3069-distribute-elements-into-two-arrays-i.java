class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> res1=new ArrayList<>();
        ArrayList<Integer> res2=new ArrayList<>();

        res1.add(nums[0]);
        res2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            if(res1.get(res1.size()-1)>res2.get(res2.size()-1)){
                res1.add(nums[i]);
            }
            else{
                res2.add(nums[i]);
            }
        }

        int arr[]=new int[nums.length];
        res1.addAll(res2);
        for(int i=0;i<nums.length;i++){
            arr[i]=res1.get(i);
        }
        return arr;
    }
}

