class Solution {
    public int scoreOfParentheses(String s) {
        int max=0;
        int curr=0;
        Stack<Integer> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i==')'){
                curr=st.pop()+Math.max(2*curr,1);
            }
            else{
                st.push(curr);
                curr=0;
            }
        }
        return curr;
    }
}