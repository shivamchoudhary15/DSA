class Solution {
    public String decodeString(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder res=new StringBuilder();
        for(char i:s.toCharArray()){
            if(i==']'){
                StringBuilder k=new StringBuilder();
                while(!st.isEmpty() && st.peek()!='['){
                    k.append(st.pop());
                }
                st.pop();
                k.reverse();
                String s1=k.toString();
                int num = 0;
                int place = 1;
                while (!st.isEmpty() && Character.isDigit(st.peek())) {
                    num += (st.pop() - '0') * place;
                    place *= 10;
                }
                while(num>1){
                    k.append(s1);
                   num--;
                }
                for(char ch : k.toString().toCharArray()){
                    st.push(ch);
                }
            }
            else{
            st.push(i);
            }
        }
        StringBuilder res1 = new StringBuilder();
            while(!st.isEmpty()){
                res1.append(st.pop());
            }

        return res1.reverse().toString();
        
    }
}