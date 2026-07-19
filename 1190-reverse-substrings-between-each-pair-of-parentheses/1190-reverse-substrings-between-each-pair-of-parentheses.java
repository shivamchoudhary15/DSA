class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st=new Stack<>();
        for(char i:s.toCharArray()){
            if(i==')'){
                StringBuilder k=new StringBuilder();
                while(!st.isEmpty()  && st.peek()!='('){
                    k.append(st.pop());
                }
                st.pop();
                for(char ch : k.toString().toCharArray()){
                    st.push(ch);
                }
            }
            else{
                st.add(i);
            }
        }
        StringBuilder res=new StringBuilder();
        while(!st.isEmpty()){
            res.append(st.pop());
        }
        return res.reverse().toString();

    }
}