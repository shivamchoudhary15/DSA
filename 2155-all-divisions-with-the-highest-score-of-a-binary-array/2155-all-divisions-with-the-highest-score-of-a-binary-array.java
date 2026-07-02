class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int zero[]=new int[nums.length+1];
        int ones[]=new int[nums.length+1];
        if(nums[0]==0){
            zero[0]=0;
        }
        if(nums[nums.length-1]==1){
            ones[nums.length-1]=0;
        }
        //0 1 0 1 0
        //0 0 1 0
        for(int i=0;i<nums.length;i++){
            zero[i+1]=zero[i];
            if(nums[i]==0){
                zero[i+1]++;
            }
        }
        for(int i=nums.length-1;i>=0;i--){
            ones[i]=ones[i+1];
            if(nums[i]==1){
                ones[i]++;
            }
           
        }
        int sum=0;
        int max=0;
        for(int i=0;i<ones.length;i++){
            sum=ones[i]+zero[i];
            max=Math.max(max,sum);
        }        
        for(int i=0;i<ones.length;i++){
            if(ones[i]+zero[i]==max){
                res.add(i);
            }
        }
        return res;
    }
}