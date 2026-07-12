class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int nums[]=new int[arr.length];
        for(int i=0;i<nums.length;i++){
            nums[i]=arr[i];
        }
        Arrays.sort(nums);
        int count=1;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            if(!map.containsKey(i)){
                map.put(i,count++);
            }   
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}