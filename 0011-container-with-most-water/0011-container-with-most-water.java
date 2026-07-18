class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int width=0;
        int maxarea=0;
        int minhigh=0;
        while(left<right){
            width=right-left;
            minhigh=Integer.min(height[left],height[right]);
            maxarea=Integer.max(maxarea,width*(minhigh));
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxarea;
    }
}