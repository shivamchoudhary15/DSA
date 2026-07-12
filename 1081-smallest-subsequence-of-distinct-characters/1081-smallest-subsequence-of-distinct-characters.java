class Solution {
    public String smallestSubsequence(String s) {
        int l[]=new int[26];
        for(int i=0;i<s.length();i++){
            l[s.charAt(i)-'a']=i;
        }
        boolean s1[]=new boolean[26];
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            int curr=s.charAt(i)-'a';
            if(s1[curr]) continue;
            while(!st.isEmpty() && st.peek()>curr && i<l[st.peek()]){
                s1[st.pop()]=false;
            }
            st.push(curr);
            s1[curr]=true;
        }
        StringBuilder sb = new StringBuilder();
        while (!st.isEmpty())
            sb.append((char) (st.pop() +'a'));
        return sb.reverse().toString();
    }
}