class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int ps[]=new int[n];
        int ns[]=new int[n];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ps[i]=-1;
            }
            else{
                ps[i]=stack.peek();
            }
            stack.push(i);
        }
        stack.clear();
        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ns[i]=n;
            }
            else{
                ns[i]=stack.peek();
            }
            stack.push(i);
        }

        int c=0;
        int max=0;
        for(int i=0;i<heights.length;i++){
            int b=ns[i]-ps[i]-1; 
            c=b*heights[i];
            max=Math.max(max,c);
        }
        return max;

    }
}