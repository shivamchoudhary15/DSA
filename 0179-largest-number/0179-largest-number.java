class Solution {
    public String largestNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                String s1=String.valueOf(nums[i]);
                String s2=String.valueOf(nums[j]);
                String s3=s1+s2;
                String s4=s2+s1;
                if((s3+s4).compareTo(s4+s3)<=0){
                    int temp=nums[i];
                    nums[i]=nums[j];
                    nums[j]=temp;
                }
            }
        }
        String  s1="";
        for(int i=0;i<nums.length;i++){
            s1+=nums[i];
        }
        if(s1.matches("^0+$")){
            return "0";
        }
        return s1;
       
    }
}